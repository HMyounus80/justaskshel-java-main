package app.justaskshel.config;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import org.springframework.context.annotation.Configuration;

/**
 * @author Denton East
 * @since quadhaven-web:1.0.0
 */
//@Configuration
//@EnableJpaRepositories(
//    basePackageClasses = {WishlistModule.class}
//    entityManagerFactoryRef = PrimaryDataSourceConfiguration.EMF_NAME,
//    transactionManagerRef = PrimaryDataSourceConfiguration.TXM_NAME
//)
public class PrimaryJpaConfiguration {
    private static final String DSGROUP = ""; // Use Maven filter resources to change this value.
    //
    static final String EMF_NAME = DSGROUP + "EntityManagerFactory";
    static final String TXM_NAME = DSGROUP + "TransactionManager";
    static final String DSP_NAME = DSGROUP + "DataSourceProperties";
    static final String DS_NAME  = DSGROUP + "DataSource";
    //
    /**
     * Here it will get url, username, password and driver-class-name
     * which we have defined in application properties file for company.
     * @return
     */
    @Primary
    @Bean(name = DSP_NAME)
    @ConfigurationProperties("spring.datasource" + DSGROUP)
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * Create the datasource using companyDataSourceProperties
     * @return
     */
    @Primary
    @Bean(name = DS_NAME)
    @ConfigurationProperties("spring.datasource" + DSGROUP + ".configuration")
    public DataSource dataSource() {
        return dataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    /**
     * EntityManager will find Entity classes inside this company package
     * (i.e com.techgeeknext.entities.company.Company).
     * @param builder
     * @return
     */
    @Primary
    @Bean(name = EMF_NAME)
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        
        bean.setDataSource(dataSource());
//        bean.setPackagesToScan(
//WishlistModule.class.getPackageName()
//        );
        
        return bean;
    }

//    // Using Hibernate v5.4.28
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//            EntityManagerFactoryBuilder builder) {
//        return builder
//            .dataSource(dataSource())
//            .packages(
//                QuadHavenModule.class
//            )
//            .build();
//    }

    @Primary
    @Bean(name = TXM_NAME)
    public PlatformTransactionManager transactionManager(
            final @Qualifier(EMF_NAME) LocalContainerEntityManagerFactoryBean emf) {
        return new JpaTransactionManager(emf.getObject());
    }
}
