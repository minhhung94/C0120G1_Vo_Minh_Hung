package com.minhhung.sprint3.service;

import com.minhhung.sprint3.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    Page<User> findAllByDeleteFlagIsNull(Pageable pageable);
    User findAllByDeleteFlagIsNullAndIdIs(Integer id);
    List<User> findAllByDeleteFlagIsNull();
    void save(User user);

    void remove(Integer id);
}
