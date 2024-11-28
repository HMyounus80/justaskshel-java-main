package app.justaskshel.web.rest.controller.wishlist;

import app.justaskshel.business.repo.wishlist.WishlistPlanRepository;
import app.justaskshel.business.repo.wishlist.WishlistRepository;
import app.justaskshel.entity.wishlist.QWishlist;
import app.justaskshel.web.rest.controller.AbstractREST;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Denton East
 * @since justaskshel-spring-web:1.0.0
 */
// https://spring.io/guides/tutorials/rest
@Slf4j
@RestController()
@RequiredArgsConstructor(onConstructor_ = {@Inject})
class WishlistPlanREST extends AbstractREST {
    private static final String ENDPOINT_ROOT = WishlistREST.ENDPOINT_ROOT + "/" + PATHVAR1_FMT + "/plans";
    //
    private final WishlistPlanRepository repo;
    private final WishlistRepository parentRepo;
    
    @GetMapping(ENDPOINT_ROOT)
    ResponseEntity<?> list(@PathVariable(PATHVAR1_NAME) final String parentId) {
        final Integer pid = Integer.valueOf(parentId);
        
        Optional<QWishlist> iffy = parentRepo.findById(pid);
        if(iffy.isEmpty()) ResponseEntity.notFound();
        
        return ResponseEntity.ok(repo.findAllByWishlist(iffy.get()));
    }
    
    @PostMapping(ENDPOINT_ROOT)
    ResponseEntity<?> create() {
        return ResponseEntity.ok(List.of());
    }
    
    @GetMapping(ENDPOINT_ROOT + "/{id}")
    ResponseEntity<?> read() {
        return ResponseEntity.ok(List.of());
    }
    
    @PutMapping(ENDPOINT_ROOT + "/{id}")
    ResponseEntity<?> update() {
        return ResponseEntity.ok(List.of());
    }
    
    @DeleteMapping(ENDPOINT_ROOT + "/{id}")
    ResponseEntity<?> delete() {
        return ResponseEntity.ok(List.of());
    }
}
