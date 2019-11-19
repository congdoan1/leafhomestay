package mum.edu.leafhomestay.service.impl;

import mum.edu.leafhomestay.domain.User;
import mum.edu.leafhomestay.repository.UserRepository;
import mum.edu.leafhomestay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User register(User user) {
        return null;
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}
