package com.kohb.superchat.server.service;

import com.kohb.superchat.server.entity.Message;

import java.util.List;
import java.util.Optional;

public interface MessageService {

    List<Message> getAll();
    Message getById(long id);
    Message save(Message message);
    void remove(long id);

}
