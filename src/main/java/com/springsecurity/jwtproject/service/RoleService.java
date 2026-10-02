package com.springsecurity.jwtproject.service;

import com.springsecurity.jwtproject.dao.RoleDao;
import com.springsecurity.jwtproject.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
