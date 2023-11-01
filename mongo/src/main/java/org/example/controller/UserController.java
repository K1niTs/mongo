package org.example.controller;

import org.example.entity.Adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.example.entity.User;
import org.example.service.UserService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public UserController(UserService userService, MongoTemplate mongoTemplate) {
        this.userService = userService;
        this.mongoTemplate = mongoTemplate;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @GetMapping("/averageAge")
    public double getAverageAge() {
        return userService.getAverageAge();
    }

    @DeleteMapping("/delete-by-adress")
    public Map<String, String> deleteByAdress(@RequestBody Adress adress) {
        Map<String, String> result = userService.deleteByAdress(adress);
        return result;
    }
}








