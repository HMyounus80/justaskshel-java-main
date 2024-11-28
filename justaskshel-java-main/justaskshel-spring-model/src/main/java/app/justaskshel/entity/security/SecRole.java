package app.justaskshel.entity.security;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
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
@Entity(name = SecRole.OBJECT_NAME)
@Table(name = SecRole.TABLE_NAME)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SecRole implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    static final String OBJECT_NAME = "SecRole";
    //
    static final String TABLE_NAME = JASCoreEntityModule.TNPREFIX_SECURITY + "role";
    //
    @ToString.Include
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    
    @Size(max = 2147483647)
    @Column(name = "Access")
    private String access;
    @Size(max = 256)
    @Column(name = "Name")
    private String name;
    @Size(max = 256)
    @Column(name = "NormalizedName")
    private String normalizedName;
    @Size(max = 2147483647)
    @Column(name = "ConcurrencyStamp")
    private String concurrencyStamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNormalizedName() {
        return normalizedName;
    }

    public void setNormalizedName(String normalizedName) {
        this.normalizedName = normalizedName;
    }

    public String getConcurrencyStamp() {
        return concurrencyStamp;
    }

    public void setConcurrencyStamp(String concurrencyStamp) {
        this.concurrencyStamp = concurrencyStamp;
    }
}
