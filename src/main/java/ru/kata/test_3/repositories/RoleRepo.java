package ru.kata.test_3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.test_3.models.Role;
@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);

}
