package com.jwtsecurity.repository;


import com.jwtsecurity.enums.Roles;
import com.jwtsecurity.model.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void findAll() {
        logger.info("Test for findAll");
        List<Role> roles = roleRepository.findAll();
        assertEquals(0, roles.size());
    }

    @Test
    public void findById() {
        logger.info("Test is running");
        Optional<Role> role = roleRepository.findById(new Long(1));
        assertEquals(Roles.ADMIN, role.get().getName());
    }

}
