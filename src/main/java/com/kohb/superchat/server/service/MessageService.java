package com.kohb.superchat.server.service;

import com.kohb.superchat.server.entity.Message;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageService {

    List<Message> getAll();
    Message getById(long id);
    Message getByIdCustom(long id);
    List<Message> getMessageChatId(long chatId);
    Message save(Message message);
    void remove(long id);

}
