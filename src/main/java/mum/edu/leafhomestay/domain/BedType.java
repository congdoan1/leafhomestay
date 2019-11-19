package mum.edu.leafhomestay.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name = "bed_type")
public class BedType implements Serializable {

    @Id
    private long id;
    private String name;

    public Set<Homestay> getHomestays() {
        return homestays;
    }

    public void setHomestays(Set<Homestay> homestays) {
        this.homestays = homestays;
    }

    @OneToMany(mappedBy = "bedType")
    private Set<Homestay> homestays;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
