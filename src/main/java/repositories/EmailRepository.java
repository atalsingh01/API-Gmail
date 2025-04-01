package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {
}

