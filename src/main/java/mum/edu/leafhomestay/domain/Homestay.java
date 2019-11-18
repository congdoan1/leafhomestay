package mum.edu.leafhomestay.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "homestay")
public class Homestay implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private String coverImage;
	
	private String overview;
	
	private int maximumGuest;
	
	private double area;
	
	private int status;
	
	private int numberOfRoom;
	
	private int numberOfBed;
	
	private int bedType;
	
	private int numberOfBathroom;
	
	private int price;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private HomestayType type;
	
	@OneToMany(mappedBy = "homestay")
	private Media medias;
	
	@ManyToMany
	@JoinTable(name = "homestay_amenity")
	private List<Amenity> amenities;
	
	@OneToOne
	private Address address;
	
	@OneToMany(mappedBy = "homestay")
	private Set<Wishlist> wishlists;
	
	@OneToMany(mappedBy = "homestay")
	private Set<Booking> bookings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public int getMaximumGuest() {
		return maximumGuest;
	}

	public void setMaximumGuest(int maximumGuest) {
		this.maximumGuest = maximumGuest;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getNumberOfRoom() {
		return numberOfRoom;
	}

	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}

	public int getNumberOfBed() {
		return numberOfBed;
	}

	public void setNumberOfBed(int numberOfBed) {
		this.numberOfBed = numberOfBed;
	}

	public int getBedType() {
		return bedType;
	}

	public void setBedType(int bedType) {
		this.bedType = bedType;
	}

	public int getNumberOfBathroom() {
		return numberOfBathroom;
	}

	public void setNumberOfBathroom(int numberOfBathroom) {
		this.numberOfBathroom = numberOfBathroom;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public HomestayType getType() {
		return type;
	}

	public void setType(HomestayType type) {
		this.type = type;
	}

	public Media getMedias() {
		return medias;
	}

	public void setMedias(Media medias) {
		this.medias = medias;
	}

	public List<Amenity> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<Amenity> amenities) {
		this.amenities = amenities;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

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
	
	
}
