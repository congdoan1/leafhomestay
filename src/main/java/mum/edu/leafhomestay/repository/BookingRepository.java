package mum.edu.leafhomestay.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.leafhomestay.domain.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking,Long>{

}
