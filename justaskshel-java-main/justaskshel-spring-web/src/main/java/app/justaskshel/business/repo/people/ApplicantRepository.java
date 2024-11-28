package app.justaskshel.business.repo.people;

import app.justaskshel.entity.people.LApplicant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Denton East
 * @since justaskshel-spring-web:1.0.0
 */
public interface ApplicantRepository extends JpaRepository<LApplicant, Integer> {
    
}
