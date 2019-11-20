package mum.edu.leafhomestay.domain;

import mum.edu.leafhomestay.validator.PasswordMatches;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;


@Entity(name = "user")
@PasswordMatches
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank
	@Email
	private String email;

	private String phone;

	@NotBlank
	private String password;
	@Transient
	private String matchingPassword;

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

	private int enabled;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;

	private int status;

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	private Integer gender;
	
	//@ManyToMany(fetch = FetchType.EAGER)
	//@JoinTable(name = "user_role")
	//private Set<Role> roles;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private List<Role> roles = new ArrayList<Role>();

	@Transient
	private String selectedRole;

	public String getSelectedRole() {
		return selectedRole;
	}

	public void setSelectedRole(String selectedRole) {
		this.selectedRole = selectedRole;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@OneToMany(mappedBy = "user")
	private Set<Wishlist> wishlists;
	
	@OneToMany(mappedBy = "user")
	private Set<Booking> bookings;
	
	@OneToMany(mappedBy = "owner")
	private List<Homestay> homestays;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	//public Set<Role> getRoles() {
	//	return roles;
	//}

	//public void setRoles(Set<Role> roles) {
	//	this.roles = roles;
	//}

	public Set<Wishlist> getWishlists() {
		return wishlists;
	}

	public void setWishlists(Set<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}
	
	
}
