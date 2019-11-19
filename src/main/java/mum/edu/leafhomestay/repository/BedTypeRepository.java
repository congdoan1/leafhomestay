package mum.edu.leafhomestay.repository;

import mum.edu.leafhomestay.domain.BedType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedTypeRepository extends CrudRepository<BedType, Long> {
}
