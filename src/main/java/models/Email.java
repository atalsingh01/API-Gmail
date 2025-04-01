package models;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "emails")
public class Email {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false)
 private String to;

 @Column(nullable = false)
 private String subject;

 @Column(nullable = false)
 private String message;

 @ManyToOne
 @JoinColumn(name = "user_id", nullable = false)
 private User user;

 @Column(updatable = false)
 private LocalDateTime createdAt;

 @PrePersist
 protected void onCreate() {
     createdAt = LocalDateTime.now();
 }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public LocalDateTime getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}

@Override
public String toString() {
	return "Email [id=" + id + ", to=" + to + ", subject=" + subject + ", message=" + message + ", user=" + user
			+ ", createdAt=" + createdAt + "]";
}

 // Getters and setters...
}
