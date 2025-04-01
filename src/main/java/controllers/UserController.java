package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.User;
import services.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

 @Autowired
 private UserService userService;

 @GetMapping
 public List<User> getAllUsers() {
     return userService.getAllUsers();
 }

 @PostMapping
 public ResponseEntity<User> createUser(@RequestBody User user) {
     User savedUser = userService.saveUser(user);
     return ResponseEntity.ok(savedUser);
 }

 // Additional endpoints can be added as needed...
}

