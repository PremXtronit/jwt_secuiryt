package com.jwtsecurity.repository;


import com.jwtsecurity.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Role> getRoles() {
        return jdbcTemplate.query("select *from role", new BeanPropertyRowMapper<>(Role.class));
    }

}
