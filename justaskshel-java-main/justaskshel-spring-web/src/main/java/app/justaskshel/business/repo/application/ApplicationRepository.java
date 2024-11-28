package app.justaskshel.business.repo.application;

import app.justaskshel.entity.application.LApplication;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Denton East
 * @since justaskshel-spring-web:1.0.0
 */
public interface ApplicationRepository extends JpaRepository<LApplication, Integer> {
    
}
