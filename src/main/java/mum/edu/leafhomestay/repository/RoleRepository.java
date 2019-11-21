package mum.edu.leafhomestay.repository;

import mum.edu.leafhomestay.domain.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import sun.util.resources.ga.LocaleNames_ga;

public interface RoleRepository extends CrudRepository<Role, Long> {

    @Query("select e from role e where id = :id")
    Role getRoleById(@Param("id") Long id);
}
