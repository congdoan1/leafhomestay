package mum.edu.leafhomestay.repository;

import mum.edu.leafhomestay.domain.HomestayType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomestayTypeRespository extends CrudRepository<HomestayType, Long> {
}
