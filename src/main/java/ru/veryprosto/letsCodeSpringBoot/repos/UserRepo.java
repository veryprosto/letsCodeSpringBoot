package ru.veryprosto.letsCodeSpringBoot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.veryprosto.letsCodeSpringBoot.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
