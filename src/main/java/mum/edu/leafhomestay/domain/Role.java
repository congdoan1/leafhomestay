package mum.edu.leafhomestay.domain;

import java.util.Set;

import javax.persistence.*;

@Entity(name = "role")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String email;
	@Column(nullable = false)
	private String authority;
	
	//@ManyToMany(mappedBy = "roles")
	//private Set<User> users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	//public Set<User> getUsers() {
	//	return users;
	//}

	//public void setUsers(Set<User> users) {
	//	this.users = users;
	//}
	
	
}
