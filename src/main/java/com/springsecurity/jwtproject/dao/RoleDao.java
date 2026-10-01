package com.springsecurity.jwtproject.dao;

import com.springsecurity.jwtproject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository<Role,String> {}
