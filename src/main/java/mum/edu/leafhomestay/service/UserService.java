package mum.edu.leafhomestay.service;


import mum.edu.leafhomestay.domain.User;

public interface UserService {

    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(long id);

    User getUserByEmail(String email);
}
