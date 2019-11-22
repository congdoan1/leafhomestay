package mum.edu.leafhomestay.repository;

import mum.edu.leafhomestay.domain.Homestay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface HomestayRepository extends CrudRepository<Homestay, Long> {

    @Query("select distinct h from homestay h, booking b where" +
            " h.address.street like %:location%" +
            " and h.id = b.homestay.id and (b.checkInDate not between :dateFrom and :dateTo)" +
            " and (b.checkOutDate not between :dateFrom and :dateTo)" +
            " and h.maximumGuest >= :numberOfGuest")
    List<Homestay> search(@Param("location") String location, @Param("dateFrom") LocalDate dateFrom, @Param("dateTo") LocalDate dateTo,
                          @Param("numberOfGuest") int numberOfGuest);

    List<Homestay> findByOwnerId(Long ownerId);
}
