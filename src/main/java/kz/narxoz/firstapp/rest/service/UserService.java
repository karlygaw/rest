package kz.narxoz.firstapp.rest.service;

import kz.narxoz.firstapp.rest.model.Role;
import kz.narxoz.firstapp.rest.model.User;
import kz.narxoz.firstapp.rest.repository.RoleRepository;
import kz.narxoz.firstapp.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(Collections.singletonList(roleRepository.getById(5L)))); // USER
        userRepository.save(user);
    }
}