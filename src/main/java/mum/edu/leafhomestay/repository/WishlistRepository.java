package mum.edu.leafhomestay.repository;

import mum.edu.leafhomestay.domain.Amenity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends CrudRepository<Amenity, Long> {
}
