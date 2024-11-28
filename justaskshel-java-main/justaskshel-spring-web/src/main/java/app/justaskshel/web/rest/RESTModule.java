package app.justaskshel.web.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author Denton East
 * @since justaskshel-spring-web:1.0.0
 */
@Configuration
@ComponentScan()
public class RESTModule {
    public static final String API_ROOT_PREFIX = "/api/v1";
    public static final String API_LEADS_PREFIX = API_ROOT_PREFIX + "/leads";
    //
    public static final String LEGACY_API_ROOT_PREFIX = "/web-api/v1";
}
