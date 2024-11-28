package app.justaskshel.business.repo.wishlist;

import app.justaskshel.entity.wishlist.QWishlist;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Denton East
 * @since justaskshel-spring-web:1.0.0
 */
public interface WishlistRepository extends JpaRepository<QWishlist, Integer> {
    
}
