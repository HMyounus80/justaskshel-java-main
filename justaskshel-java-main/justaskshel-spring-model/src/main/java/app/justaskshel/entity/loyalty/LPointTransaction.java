package app.justaskshel.entity.loyalty;

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
 * @since be-insured-module-core:1.0.0
 */
@XmlRootElement
//
@Entity(name = LPointTransaction.OBJECT_NAME)
@Table(name = LPointTransaction.TABLE_NAME)
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LPointTransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    static final String OBJECT_NAME = "LPointTransaction";
    //
    static final String TABLE_NAME = JASCoreEntityModule.TNPREFIX_LOYALTY + "point_transaction";
    //
    @ToString.Include
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "member_id")
    private Integer memberId;
    @Size(max = 50)
    @Column(name = "event_kind")
    private String eventKind;
    @Column(name = "value")
    private Long value;
    @Column(name = "transaction_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}
