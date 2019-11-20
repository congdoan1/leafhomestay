package mum.edu.leafhomestay.domain;

import mum.edu.leafhomestay.enumeration.HomestayStatus;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "homestay")
public class Homestay implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String title;

    private String coverImage;

    @NotEmpty
    private String overview;

    @NotNull
    private int maximumGuest;

    @NotNull
    private double area;

    @NotNull
    private int status = HomestayStatus.PENDING.ordinal();

    @NotNull
    @Size(min = 1, message = "{homestay.size}")
    private int numberOfRoom;

    @NotNull
    @Size(min = 1, message = "{homestay.size}")
    private int numberOfBed;

    @ManyToOne
    @JoinColumn(name = "bedType_id")
    private BedType bedType;

    private int numberOfBathroom;

    @NotNull
    @Size(min = 1, message = "{homestay.price}")
    private int price;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private HomestayType homestayType;

    @OneToMany(mappedBy = "homestay")
    private Set<Media> medias;

    @ManyToMany
    @JoinTable(name = "homestay_amenity")
    private List<Amenity> amenities;

    @OneToOne(mappedBy = "homestay")
    private Address address;

    @OneToMany(mappedBy = "homestay")
    private Set<Wishlist> wishlists;

    @OneToMany(mappedBy = "homestay")
    private Set<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

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

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
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

    public HomestayType getHomestayType() {
        return homestayType;
    }

    public void setHomestayType(HomestayType homestayType) {
        this.homestayType = homestayType;
    }

    public Set<Media> getMedias() {
        return medias;
    }

    public void setMedias(Set<Media> medias) {
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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }



}
