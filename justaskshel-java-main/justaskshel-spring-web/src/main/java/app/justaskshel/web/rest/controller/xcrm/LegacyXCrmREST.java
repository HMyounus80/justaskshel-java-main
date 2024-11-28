package app.justaskshel.web.rest.controller.xcrm;

import app.justaskshel.business.repo.application.ApplicationRepository;
import app.justaskshel.model.xcrm.VTContact;
import app.justaskshel.model.xcrm.VTLead;
import app.justaskshel.web.rest.RESTModule;
import jakarta.inject.Inject;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Denton East
 * @since justaskshel-spring-app:1.0.0
 */
// https://spring.io/guides/tutorials/rest
@Slf4j
@RestController()
@RequiredArgsConstructor(onConstructor_ = {@Inject})
class LegacyXCrmREST {
    private static final String ENDPOINT_ROOT = RESTModule.LEGACY_API_ROOT_PREFIX + "/xcrm";
    //
    private final ApplicationRepository repo;
    
    @PostMapping(ENDPOINT_ROOT + "/contacts")
    ResponseEntity<?> contacts(@RequestBody final VTContact data) {
        return ResponseEntity.ok(data);
    }
    
    @PostMapping(ENDPOINT_ROOT + "/leads")
    ResponseEntity<?> leads(@RequestBody final VTLead data) {
        return ResponseEntity.ok(data);
    }
}
