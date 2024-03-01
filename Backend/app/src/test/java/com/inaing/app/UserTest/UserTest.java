package com.inaing.app.UserTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.inaing.app.entity.Roles;
import com.inaing.app.entity.User;
import com.inaing.app.repository.UserRepository;

import jakarta.transaction.Transactional;

@DataJpaTest
public class UserTest {

    @Autowired
    private UserRepository repository;

    @Transactional
    @Test
    public void saveUserTest() {
        User user = new User();
        user.setEmail("saugat@gmail.com");
        user.setFirstname("Saugat");
        user.setLastname("Singh");
        user.setMobile("981308452");
        user.setPassword("saugat123");
        user.setRole(Roles.USER.toString());
        user.setVerified(false);
        repository.save(user);
        Assertions.assertTrue(user.getId() > 0);
    }

    @Test
    public void retrieveUserTest() {
        Long userId = 1L;

        User retrievedUser = repository.findById(userId).orElse(null);

        Assertions.assertNotNull(retrievedUser);
        Assertions.assertEquals("saugat@gmail.com", retrievedUser.getEmail());
    }

    @Transactional
    @Test
    public void updateUserTest() {
        Long userId = 1L;

        User existingUser = repository.findById(userId).orElse(null);
        Assertions.assertNotNull(existingUser);
        existingUser.setFirstname("UpdatedFirstName");
        existingUser.setLastname("UpdatedLastName");

        repository.save(existingUser);

        User updatedUser = repository.findById(userId).orElse(null);

        Assertions.assertNotNull(updatedUser);
        Assertions.assertEquals("UpdatedFirstName", updatedUser.getFirstname());
        Assertions.assertEquals("UpdatedLastName", updatedUser.getLastname());
    }

    @Test
    public void deleteUserTest() {
        Long userId = 1L;

        repository.deleteById(userId);

        User deletedUser = repository.findById(userId).orElse(null);

        Assertions.assertNull(deletedUser);
    }
}
