package com.habib.sprint5.repos;

import com.habib.sprint5.entities.Role;
import com.habib.sprint5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);

    @Query("select r from Role r where r.role_id = ?1")
    Role findRoleById(Long id);
}

