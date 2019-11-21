package mum.edu.leafhomestay.service;


import mum.edu.leafhomestay.domain.Role;
import mum.edu.leafhomestay.domain.User;

import java.util.Optional;

public interface UserService {

    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(long id);
    Role getRoleById(Long id);

    User getUserByEmail(String email);

}
