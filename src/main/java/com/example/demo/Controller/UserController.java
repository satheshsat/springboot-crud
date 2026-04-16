package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) { return service.saveUser(user); }

    @GetMapping("/all")
    public List<User> findAllUsers() { return service.getUsers(); }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) { return service.saveUser(user); }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return "User removed !! " + id;
    }
}