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
@Slf4j
@RestController()
@RequiredArgsConstructor(onConstructor_ = {@Inject})
class WishlistREST {
    static final String ENDPOINT_ROOT = RESTModule.API_ROOT_PREFIX + "/wishlists";
    //
    private final WishlistRepository repo;
    
    @GetMapping(ENDPOINT_ROOT)
    ResponseEntity<?> list() {
        return ResponseEntity.ok(repo.findAll());
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
