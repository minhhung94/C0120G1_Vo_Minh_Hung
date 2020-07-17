package com.minhhung.sprint3.service;

import com.minhhung.sprint3.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    Page<User> findAllByDeleteFlagIsNullAndFullNameContainingAndUserNameContaining(String fullName, String userName, Pageable pageable);
    User findAllByDeleteFlagIsNullAndIdIs(Integer id);
    List<User> findAllByDeleteFlagIsNull();
    void save(User user);

    void remove(Integer id);
}
