package mum.edu.leafhomestay.service.impl;

import javax.transaction.Transactional;

import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.leafhomestay.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }


    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
