package mum.edu.leafhomestay.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "booking")
public class Booking implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty(message = "{NotEmpty.user}")
	@Valid
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@NotEmpty(message = "{NotEmpty.homesty}")
	@Valid
	@ManyToOne
	@JoinColumn(name = "homestay_id")
	private Homestay homestay;

	@NotNull(message = "{NotNull.checkInDate}")
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private LocalDateTime checkInDate;

	@NotNull(message = "{NotNull.checkOutDate}")
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private LocalDateTime checkOutDate;

	@NotNull
	private double totalPrice;

	@NotEmpty(message = "{NotEmpty.payment}")
	@Valid
	@OneToOne
	@JoinColumn
	private Payment payment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Homestay getHomestay() {
		return homestay;
	}

	public void setHomestay(Homestay homestay) {
		this.homestay = homestay;
	}

	public LocalDateTime getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDateTime checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDateTime getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDateTime checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public double getTotalPrice() {

		this.totalPrice = this.homestay.getPrice()
				* (this.getCheckOutDate().getDayOfYear() - this.getCheckInDate().getDayOfYear());
		return totalPrice;
	}

}
