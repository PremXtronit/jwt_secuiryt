package com.jwtsecurity.repository;


import com.jwtsecurity.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {


}
