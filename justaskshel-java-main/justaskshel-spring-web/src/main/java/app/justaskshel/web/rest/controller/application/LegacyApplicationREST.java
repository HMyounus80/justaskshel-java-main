package app.justaskshel.web.rest.controller.application;

import app.justaskshel.business.repo.wishlist.WishlistRepository;
import app.justaskshel.web.rest.RESTModule;
import jakarta.inject.Inject;
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
 * @since justaskshel-spring-app:1.0.0
 */
// https://spring.io/guides/tutorials/rest
@Deprecated
@Slf4j
@RestController()
@RequiredArgsConstructor(onConstructor_ = {@Inject})
class LegacyApplicationREST {
    private static final String ENDPOINT_ROOT = RESTModule.LEGACY_API_ROOT_PREFIX + "/leads/applications";
    //
    private final WishlistRepository repo;
    
    @Deprecated
    @PostMapping(ENDPOINT_ROOT + "/add-application")
    ResponseEntity<?> add() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/add-application");
    }
    
    @PostMapping(ENDPOINT_ROOT + "/add")
    ResponseEntity<?> add2() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/add");
    }
    
    // -------------------------------------------------------------------------
    
    @Deprecated
    @GetMapping(ENDPOINT_ROOT + "/get-application")
    ResponseEntity<?> get() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/get-application");
    }
    
    @GetMapping(ENDPOINT_ROOT + "/list")
    ResponseEntity<?> get2() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/list");
    }
    
    // -------------------------------------------------------------------------
    
    @Deprecated
    @PutMapping(ENDPOINT_ROOT + "/edit-application")
    ResponseEntity<?> edit() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/edit-application");
    }
    
    @PutMapping(ENDPOINT_ROOT + "/edit/{id}")
    ResponseEntity<?> edit2() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/edit/{id}");
    }
    
    // -------------------------------------------------------------------------
    
    @Deprecated
    @DeleteMapping(ENDPOINT_ROOT + "/remove/{id}")
    ResponseEntity<?> removeItem() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/remove/{id}");
    }
    
    @DeleteMapping(ENDPOINT_ROOT + "/delete/{id}")
    ResponseEntity<?> removeItem2() {
        return ResponseEntity.ok(ENDPOINT_ROOT + "/delete/{id}");
    }
}
