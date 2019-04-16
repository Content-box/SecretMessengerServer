package com.kohb.superchat.server.repository;

import com.kohb.superchat.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);
}