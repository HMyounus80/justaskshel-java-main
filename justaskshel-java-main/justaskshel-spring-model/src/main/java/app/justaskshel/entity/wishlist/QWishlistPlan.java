package app.justaskshel.entity.wishlist;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Entity(name = QWishlistPlan.OBJECT_NAME)
@Table(name = QWishlistPlan.TABLE_NAME)
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class QWishlistPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    static final String OBJECT_NAME = "QWishlistPlan";
    //
    static final String TABLE_NAME = JASCoreEntityModule.TNPREFIX_WISHLIST + "wishlist_plan";
    //
    @ToString.Include
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "item_id")
    private String itemId;
    @Size(max = 100)
    @Column(name = "product_name")
    private String productName;
    @Size(max = 100)
    @Column(name = "carrier_name")
    private String carrierName;
    @Size(max = 255)
    @Column(name = "carrier_description")
    private String carrierDescription;
    @Size(max = 255)
    @Column(name = "enrollment_url")
    private String enrollmentUrl;
    @Size(max = 2147483647)
    @Column(name = "enroll_request_spec")
    private String enrollRequestSpec;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "product_price")
    private BigDecimal productPrice;
    @Size(max = 2147483647)
    @Column(name = "plan_details")
    private String planDetails;
    @Size(max = 2147483647)
    @Column(name = "attachments")
    private String attachments;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Size(max = 2147483647)
    @Column(name = "quote_criteria")
    private String quoteCriteria;
    @JoinColumn(name = "wishlist_id")
    @ManyToOne(optional = false)
    private QWishlist wishlist;
}
