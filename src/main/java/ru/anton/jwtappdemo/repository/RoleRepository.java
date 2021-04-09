package ru.anton.jwtappdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.anton.jwtappdemo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
