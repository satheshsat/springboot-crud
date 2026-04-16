package com.example.demo.service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user) { return repository.save(user); }
    public List<User> getUsers() { return repository.findAll(); }
    public User getUserById(Long id) { return repository.findById(id).orElse(null); }
    public void deleteUser(Long id) { repository.deleteById(id); }
}