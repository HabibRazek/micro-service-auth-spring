package com.habib.sprint5.service;

import com.habib.sprint5.entities.Role;
import com.habib.sprint5.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(long id, Role r);
    List<User> findAllUsers();

    void deleteUser(long id);
    User removeRoleFromUser(long id, Role r);
    List<Role> findAllRoles();

    Role findRoleById(Long id);

    User findUserById(Long id);

    User activateUser(String username, String code);

}
