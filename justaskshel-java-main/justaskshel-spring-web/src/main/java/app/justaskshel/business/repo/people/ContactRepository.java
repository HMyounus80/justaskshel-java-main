package app.justaskshel.business.repo.people;

import app.justaskshel.entity.people.LContact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Denton East
 * @since justaskshel-spring-web:1.0.0
 */
public interface ContactRepository extends JpaRepository<LContact, Integer> {
    
}
