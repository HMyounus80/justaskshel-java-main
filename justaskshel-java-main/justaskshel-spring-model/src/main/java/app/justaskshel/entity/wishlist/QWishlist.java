package app.justaskshel.entity.wishlist;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import app.justaskshel.entity.JASCoreEntityModule;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Denton East
 * @since justaskshel-spring-model:1.0.0
 */
@XmlRootElement
//
@Entity(name = QWishlist.OBJECT_NAME)
@Table(name = QWishlist.TABLE_NAME)
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class QWishlist implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    static final String OBJECT_NAME = "QWishlist";
    //
    static final String TABLE_NAME = JASCoreEntityModule.TNPREFIX_WISHLIST + "wishlist";
    //
    @ToString.Include
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "selected_quote_id")
    private Integer selectedQuoteId;
    @Column(name = "quote_search_id")
    private Integer quoteSearchId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(mappedBy = "wishlist")
    private Set<QWishlistPlan> wishlistPlans;
//    @JoinColumn(name = "user_id", referencedColumnName = "Id")
//    @ManyToOne(optional = false)
//    private QWishlist wishList;
    
//    @XmlTransient
//    public Set<QWishlistPlan> getQWishlistPlanSet() {
//        return wishlistPlans;
//    }
}
