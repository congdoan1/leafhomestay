package mum.edu.leafhomestay.repository;

import mum.edu.leafhomestay.domain.Homestay;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomestayRepository extends CrudRepository<Homestay, Long> {

}
