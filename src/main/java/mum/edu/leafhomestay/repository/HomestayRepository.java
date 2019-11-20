package mum.edu.leafhomestay.repository;

import mum.edu.leafhomestay.domain.Homestay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface HomestayRepository extends CrudRepository<Homestay, Long> {

//    @Query("SELECT h FROM homestay h WHERE h.address.street LIKE CONCAT('%', :term, '%')")
//    List<Homestay> search(@Param("term") String term, @Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo,
//                          @Param("numberOfGuest") int numberOfGuest);
}
