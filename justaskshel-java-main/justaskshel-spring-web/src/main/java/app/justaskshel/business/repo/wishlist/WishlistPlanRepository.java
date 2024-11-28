package app.justaskshel.business.repo.wishlist;

import app.justaskshel.entity.wishlist.QWishlist;
import app.justaskshel.entity.wishlist.QWishlistPlan;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Denton East
 * @since justaskshel-spring-web:1.0.0
 */
public interface WishlistPlanRepository extends JpaRepository<QWishlistPlan, Integer> {
    List<QWishlistPlan> findAllByWishlist(QWishlist wishlist);
}
