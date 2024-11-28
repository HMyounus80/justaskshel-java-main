package app.justaskshel.model.xcrm;

import app.justaskshel.entity.wishlist.QWishlist;
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
public class VTContact implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    @ToString.Include
    @JsonProperty("firstname")
    private String firstName;
    @ToString.Include
    @JsonProperty("lastname")
    private String lastName;
    
    @JsonProperty("organizationname")
    private String organizationName;
    @JsonProperty("leadsource")
    private VTLeadSourceKind leadSource;
    
    @ToString.Include
    @JsonProperty("title")
    private String title;
    
    @JsonProperty("department")
    private String department;
    @JsonProperty("primary_email")
    private String primaryEmail;
    @JsonProperty("assistant")
    private String assistant;
    @JsonProperty("assistant_phone")
    private String assistantPhone;
    @JsonProperty("emailoptout")
    private String emailOptOut;
    
    @ToString.Include
    @EqualsAndHashCode.Include
    @JsonProperty("contact_id")
    private String contactId;
    
    @JsonProperty("office_phone")
    private String officePhone;
    @JsonProperty("mobile_phone")
    private String mobilePhone;
    @JsonProperty("home_phone")
    private String homePhone;
    @JsonProperty("secondary_phone")
    private String secondaryPhone;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("reports_to")
    private String reports_to;
    @JsonProperty("secondary_email")
    private String secondary_email;
    @JsonProperty("salutationtype")
    private String salutationtype;
    @JsonProperty("mailing_street")
    private String mailing_street;
    @JsonProperty("mailing_po_box")
    private String mailing_po_box;
    @JsonProperty("mailing_city")
    private String mailing_city;
    @JsonProperty("mailing_state")
    private String mailing_state;
    @JsonProperty("mailing_zip")
    private String mailing_zip;
    @JsonProperty("mailing_country")
    private String mailing_country;
    //
    @JsonProperty("other_street")
    private String other_street;
    @JsonProperty("other_po_box")
    private String other_po_box;
    @JsonProperty("other_city")
    private String other_city;
    @JsonProperty("other_state")
    private String other_state;
    @JsonProperty("other_zip")
    private String other_zip;
    @JsonProperty("other_country")
    private String other_country;
        //
    @JsonProperty("selected_plans")
    private QWishlist selected_plans;
}
