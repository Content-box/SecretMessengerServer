package com.kohb.superchat.server.repository;

import com.kohb.superchat.server.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
