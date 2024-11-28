package app.justaskshel.model.xcrm;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Denton East
 * @since justaskshel-spring-model:1.0.0
 */

@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class VTLead implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    @ToString.Include
    @JsonProperty("firstname")
    private String firstname;
    @ToString.Include
    @JsonProperty("lastname")
    private String lastname;
    //
    @JsonProperty("company")
    private String company;
    @JsonProperty("annual_revenue")
    public Integer annual_revenue; // Ensure this is an integer
    @JsonProperty("no_of_employee")
    public Integer no_of_employee; // Ensure this is an integer
    @JsonProperty("primary_email")
    private String primary_email;
    @JsonProperty("primary_phone")
    private String primary_phone;
    @JsonProperty("mobile_phone")
    private String mobile_phone;
}
