package ru.anton.jwtappdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.anton.jwtappdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
