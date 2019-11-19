package mum.edu.leafhomestay.service;

import mum.edu.leafhomestay.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<User> getAll();

    public User register(User user);

    public User get(Long id);

    public User getUserByEmail(String email);


}
