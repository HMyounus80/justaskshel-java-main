package app.justaskshel.entity.security;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import app.justaskshel.entity.JASCoreEntityModule;

/**
 * @author Denton East
 * @since be-insured-module-core:1.0.0
 */
@XmlRootElement
//
@Entity(name = SecSocialAuth.OBJECT_NAME)
@Table(name = SecSocialAuth.TABLE_NAME)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SecSocialAuth implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    static final String OBJECT_NAME = "SecSocialAuth";
    //
    static final String TABLE_NAME = JASCoreEntityModule.TNPREFIX_SECURITY + "social_auth";
    //
    @ToString.Include
    @EqualsAndHashCode.Include
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SocialLoginId")
    private Integer socialLoginId;
    @Size(max = 50)
    @Column(name = "Provider")
    private String provider;
    @Size(max = 100)
    @Column(name = "ProviderUserId")
    private String providerUserId;
    @Size(max = 2147483647)
    @Column(name = "AccessToken")
    private String accessToken;
    @Size(max = 2147483647)
    @Column(name = "RefreshToken")
    private String refreshToken;
    @Size(max = 100)
    @Column(name = "FirstName")
    private String firstName;
    @Size(max = 100)
    @Column(name = "LastName")
    private String lastName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Integer getSocialLoginId() {
        return socialLoginId;
    }

    public void setSocialLoginId(Integer socialLoginId) {
        this.socialLoginId = socialLoginId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProviderUserId() {
        return providerUserId;
    }

    public void setProviderUserId(String providerUserId) {
        this.providerUserId = providerUserId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
