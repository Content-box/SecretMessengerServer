package com.kohb.superchat.server.repository;

import com.kohb.superchat.server.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

//    @Query("select m from Message m where m.chatId = :chatId")
//    List<Message> findByChatId(@Param("chatId") long chatId);

    List<Message> findByChatId(long chatId);

    Message findById(long id);

}
