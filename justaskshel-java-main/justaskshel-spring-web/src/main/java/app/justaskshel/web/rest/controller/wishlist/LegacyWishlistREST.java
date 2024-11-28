package app.justaskshel.web.rest.controller.wishlist;

import app.justaskshel.business.repo.wishlist.WishlistRepository;
import app.justaskshel.web.rest.RESTModule;
import jakarta.inject.Inject;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Denton East
 * @since justaskshel-spring-web:1.0.0
 */
// https://spring.io/guides/tutorials/rest
@Deprecated
@Slf4j
@RestController()
@RequiredArgsConstructor(onConstructor_ = {@Inject})
class LegacyWishlistREST {
    private static final String ENDPOINT_ROOT = RESTModule.LEGACY_API_ROOT_PREFIX + "/plan-cart";
    //
    private final WishlistRepository repo;
    
    @Deprecated
    @PostMapping(ENDPOINT_ROOT + "/add-plan")
    ResponseEntity<?> addPlan() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/add-plan");
    }
    
    @PostMapping(ENDPOINT_ROOT + "/add")
    ResponseEntity<?> addPlan2() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/add");
    }
    
    // -------------------------------------------------------------------------
    
    @Deprecated
    @GetMapping(ENDPOINT_ROOT + "/get-plan")
    ResponseEntity<?> getPlan() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/get-plan");
    }
    
    @GetMapping(ENDPOINT_ROOT + "/list")
    ResponseEntity<?> getPlan2() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/list");
    }
    
    // -------------------------------------------------------------------------
    
    @Deprecated
    @DeleteMapping(ENDPOINT_ROOT + "/remove/{item_id}")
    ResponseEntity<?> removeItem() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/remove/{item_id}");
    }
    
    @DeleteMapping(ENDPOINT_ROOT + "/delete/{item_id}")
    ResponseEntity<?> removeItem2() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/delete/{item_id}");
    }
    
    // -------------------------------------------------------------------------
    
    @GetMapping(ENDPOINT_ROOT + "/get-dashboard-items")
    ResponseEntity<?> getAllCartItems() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/get-dashboard-items");
    }
}
