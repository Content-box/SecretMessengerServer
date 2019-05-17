package com.kohb.superchat.server.repository;

import com.kohb.superchat.server.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
