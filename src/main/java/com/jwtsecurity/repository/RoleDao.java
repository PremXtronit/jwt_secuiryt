package com.jwtsecurity.repository;


import com.jwtsecurity.enums.Roles;
import com.jwtsecurity.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RoleDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PersistenceContext
    private EntityManager em;

    private RowMapper<Role> roleRowMapper = (resultSet, i) -> {
        Role role = new Role();
        role.setId(resultSet.getLong("id"));
        role.setName(Roles.valueOf(resultSet.getString("name")));
        role.setDescription(resultSet.getString("description"));
        return role;
    };

    public List<Role> findAll() {
        return jdbcTemplate.query("select *from role", new BeanPropertyRowMapper<>(Role.class));
    }

    public Role findById(Long id) {
        return jdbcTemplate.queryForObject("select *from role where id=?", new Object[]{id}, roleRowMapper);
    }

    public int deleteById(Long id) {
        return jdbcTemplate.update("delete from role where id=?", id);
    }

    public int insert(Role role) {
        return jdbcTemplate.update("inser into role (id,name,description)",
                role.getId(), role.getName(), role.getDescription());
    }
}
