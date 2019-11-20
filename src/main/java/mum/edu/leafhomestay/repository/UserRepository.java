package mum.edu.leafhomestay.repository;

import mum.edu.leafhomestay.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    //@Query("select u from User u where u.emailAddress = ?1")
    //@Query("SELECT u FROM User u where u.email = ?1")
    //@Query("SELECT u from User u where u.email = :email")
    //User getUserByEmail(@Param("email") String email);

    User findByEmail(String email);
}
