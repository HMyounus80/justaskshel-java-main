package app.justaskshel.entity.leads;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
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
@Entity(name = LSetupStatus.OBJECT_NAME)
@Table(name = LSetupStatus.TABLE_NAME)
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LSetupStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    static final String OBJECT_NAME = "LSetupStatus";
    //
    static final String TABLE_NAME = JASCoreEntityModule.TNPREFIX_LEADS + "setup_status";
    //
    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "status_id")
    private Integer statusId;
    @Size(max = 100)
    @Column(name = "status_name")
    private String statusName;
}
