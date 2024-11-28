package app.justaskshel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import app.justaskshel.entity.JASCoreEntityModule;

/**
 * @author Denton East
 * @since justaskshel-spring-web:1.0.0
 */
@EntityScan(
    basePackageClasses = {JASCoreEntityModule.class}
)
@SpringBootApplication
public class App {
    public static final String CONTEXT_PATH = "";
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
