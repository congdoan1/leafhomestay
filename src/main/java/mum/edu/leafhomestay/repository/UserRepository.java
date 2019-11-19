package mum.edu.leafhomestay.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.leafhomestay.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{


}
