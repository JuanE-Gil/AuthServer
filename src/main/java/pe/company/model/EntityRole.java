package pe.company.model;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.company.enums.Rolename;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="roles")
public class EntityRole implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idrole;
	
	@Enumerated(EnumType.STRING)
	private Rolename role;

	@Override
	public String getAuthority() {
		return role.name();
	}
}
