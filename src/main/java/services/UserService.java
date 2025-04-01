package services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.User;
import repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

 @Autowired
 private UserRepository userRepository;

 public List<User> getAllUsers() {
     return userRepository.findAll();
 }

 public Optional<User> getUserByEmail(String email) {
     return userRepository.findByEmail(email);
 }

 public User saveUser(User user) {
     return userRepository.save(user);
 }

 // Other user-related methods...
}

