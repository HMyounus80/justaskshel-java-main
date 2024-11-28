package app.justaskshel.entity.people;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import app.justaskshel.entity.JASCoreEntityModule;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Denton East
 * @since be-insured-module-core:1.0.0
 */
@XmlRootElement
//
@Entity(name = LApplicant.OBJECT_NAME)
@Table(name = LApplicant.TABLE_NAME)
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LApplicant implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    static final String OBJECT_NAME = "LApplicant";
    //
    static final String TABLE_NAME = JASCoreEntityModule.TNPREFIX_LEADS + "applicant";
    //
    @ToString.Include
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "ApplicantId")
    private Integer id;
    
    @Size(max = 50)
    @Column(name = "HeightInches")
    private String heightInches;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Weight")
    private BigDecimal weight;
    @Size(max = 50)
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Dbo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dbo;
    @Size(max = 50)
    @Column(name = "TobaccoUsage")
    private String tobaccoUsage;
    @Size(max = 50)
    @Column(name = "healthclass")
    private String healthclass;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QuoteSearchId")
    private int quoteSearchId;
}
