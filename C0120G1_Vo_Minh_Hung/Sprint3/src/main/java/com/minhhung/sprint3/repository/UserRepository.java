package com.minhhung.sprint3.repository;

import com.minhhung.sprint3.model.Role;
import com.minhhung.sprint3.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findAllByDeleteFlagIsNull();
    Page<User> findAllByDeleteFlagIsNullAndFullNameContainingAndUserNameContaining(String fullName, String userName, Pageable pageable);
    User findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
