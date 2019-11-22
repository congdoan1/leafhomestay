package mum.edu.leafhomestay.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.leafhomestay.domain.Booking;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking,Long>{

    List<Booking> findByUserId(Long userId);
}
