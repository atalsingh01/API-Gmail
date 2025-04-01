package models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false)
 private String fullname;

 @Column(nullable = false, unique = true)
 private String email;

 @Column(nullable = false)
 private String password;

 @Column(nullable = false)
 private String profilePhoto;

 @Column(updatable = false)
 private LocalDateTime createdAt;

 private LocalDateTime updatedAt;

 @PrePersist
 protected void onCreate() {
     createdAt = LocalDateTime.now();
 }

 @PreUpdate
 protected void onUpdate() {
     updatedAt = LocalDateTime.now();
 }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getProfilePhoto() {
	return profilePhoto;
}

public void setProfilePhoto(String profilePhoto) {
	this.profilePhoto = profilePhoto;
}

public LocalDateTime getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}

public LocalDateTime getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(LocalDateTime updatedAt) {
	this.updatedAt = updatedAt;
}

@Override
public String toString() {
	return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password
			+ ", profilePhoto=" + profilePhoto + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
}

 // Getters and setters...
}
