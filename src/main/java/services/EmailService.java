package services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Email;
import repositories.EmailRepository;

import java.util.List;

@Service
public class EmailService {

 @Autowired
 private EmailRepository emailRepository;

 public List<Email> getAllEmails() {
     return emailRepository.findAll();
 }

 public Email saveEmail(Email email) {
     return emailRepository.save(email);
 }

 // Other email-related methods...
}

