package com.minhhung.sprint3.service.impl;

import com.minhhung.sprint3.model.Role;
import com.minhhung.sprint3.repository.RoleRepository;
import com.minhhung.sprint3.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository repository;

    @Override
    public void save(Role role) {
        repository.save(role);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
