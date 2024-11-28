package app.beinsured.apigateway.serviceb;

// https://www.geeksforgeeks.org/api-composition-and-aggregation-with-spring-cloud-gateway-in-java-microservices/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {
    @GetMapping("/service-b")
    public String getServiceB() {
        return "{\"service\": \"B\", \"message\": \"Response from Service B\"}";
    }
}
