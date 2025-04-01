package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import models.Email;
import services.EmailService;

import java.util.List;

@RestController
@RequestMapping("/api/emails")
@CrossOrigin(origins = "http://localhost:5173")
public class EmailController {

 @Autowired
 private EmailService emailService;

 @GetMapping("/getallemails")
 public List<Email> getAllEmails() {
     return emailService.getAllEmails();
 }

 @PostMapping("/sendemails")
 public ResponseEntity<Email> createEmail(@RequestBody Email email) {
     Email savedEmail = emailService.saveEmail(email);
     return ResponseEntity.ok(savedEmail);
 }

 // Additional endpoints can be added as needed...
}
