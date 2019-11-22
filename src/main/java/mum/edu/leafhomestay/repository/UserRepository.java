package mum.edu.leafhomestay.repository;

import mum.edu.leafhomestay.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT u from user u where u.email = :email")
    User findByEmail(@Param("email") String email);

}
