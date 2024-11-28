package app.justaskshel.entity.application;

import app.justaskshel.entity.JASCoreEntityModule;
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
import java.util.Date;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Denton East
 * @since justaskshel-spring-model:1.0.0
 */
@XmlRootElement
//
@Entity(name = LApplication.OBJECT_NAME)
@Table(name = LApplication.TABLE_NAME)
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LApplication implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    static final String OBJECT_NAME = "LApplication";
    //
    static final String TABLE_NAME = JASCoreEntityModule.TNPREFIX_LEADS + "application";
    //
    @ToString.Include
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "name")
    private String name;
    @Size(max = 50)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 50)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 50)
    @Column(name = "address")
    private String address;
    @Size(max = 50)
    @Column(name = "city")
    private String city;
    @Size(max = 50)
    @Column(name = "state")
    private String state;
    @Size(max = 50)
    @Column(name = "zip")
    private String zip;
    @Size(max = 50)
    @Column(name = "home_phone")
    private String homePhone;
    @Size(max = 50)
    @Column(name = "mobile_phone")
    private String mobilePhone;
    @Size(max = 50)
    @Column(name = "work_phone")
    private String workPhone;
    @Size(max = 50)
    @Column(name = "email_address")
    private String emailAddress;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "fax")
    private String fax;
    @Size(max = 50)
    @Column(name = "insurance_type")
    private String insuranceType;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "effected_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effectedDate;
    @Column(name = "submitted_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date submittedDate;
    @Column(name = "last_activity_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActivityDate;
    @Size(max = 50)
    @Column(name = "status")
    private String status;
    @Size(max = 50)
    @Column(name = "carrier")
    private String carrier;
    @Size(max = 50)
    @Column(name = "plans")
    private String plans;
    @Size(max = 50)
    @Column(name = "premium")
    private String premium;
    @Size(max = 50)
    @Column(name = "included_members")
    private String includedMembers;
    @Column(name = "marketplace_id")
    private Integer marketplaceId;
    @Column(name = "oes_application_id")
    private Integer oesApplicationId;
    @Size(max = 50)
    @Column(name = "source")
    private String source;
    @Size(max = 50)
    @Column(name = "medicate_id")
    private String medicateId;
    @Size(max = 50)
    @Column(name = "application_type")
    private String applicationType;
    @Size(max = 50)
    @Column(name = "effective_date")
    private String effectiveDate;
    @Size(max = 50)
    @Column(name = "medicare_id")
    private String medicareId;
    @Column(name = "userId") // error retrieving this column: the column request is being sent to SQL server using the name 'user_id' 
    private Integer userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}
