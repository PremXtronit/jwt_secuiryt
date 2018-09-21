package com.jwtsecurity.service;

import com.jwtsecurity.model.User;
import org.springframework.security.core.context.SecurityContextHolder;

public abstract class BaseService {


    public User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
