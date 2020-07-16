package com.minhhung.sprint3.service.impl;

import com.minhhung.sprint3.model.Role;
import com.minhhung.sprint3.model.User;
import com.minhhung.sprint3.repository.UserRepository;
import com.minhhung.sprint3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public Page<User> findAllByDeleteFlagIsNullAndFullNameContainingAndUserNameContaining(String fullName, String userName, Pageable pageable) {
        return userRepository.findAllByDeleteFlagIsNullAndFullNameContainingAndUserNameContaining(fullName, userName, pageable);
    }

    @Override
    public User findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        return userRepository.findAllByDeleteFlagIsNullAndIdIs(id);
    }

    @Override
    public List<User> findAllByDeleteFlagIsNull() {
        return userRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void remove(Integer id) {
        User user = userRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        user.setDeleteFlag(1);
        userRepository.save(user);
    }
}
