package mum.edu.leafhomestay.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.leafhomestay.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{

    //@Query("select u from User u where u.emailAddress = ?1")
    //@Query("SELECT u FROM User u where u.email = ?1")
    //@Query("SELECT u from User u where u.email = :email")
    //User getUserByEmail(@Param("email") String email);

}
