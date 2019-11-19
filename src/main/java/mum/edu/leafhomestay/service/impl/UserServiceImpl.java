package mum.edu.leafhomestay.service.impl;

import javax.transaction.Transactional;

import mum.edu.leafhomestay.repository.HomestayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.leafhomestay.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    HomestayRepository homestayRepository;
}
