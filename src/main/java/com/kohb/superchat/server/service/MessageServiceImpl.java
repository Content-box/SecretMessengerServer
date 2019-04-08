package com.kohb.superchat.server.service;

import com.kohb.superchat.server.entity.Message;
import com.kohb.superchat.server.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService {

    //Здесь вся бизнес-логика

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    @Override
    public Message getById(long id) {
        Message temp=messageRepository.getOne(id);
        Message temp2;
        return temp;
    }

    @Override
    public Message save(Message message) {
        return messageRepository.saveAndFlush(message);
    }

    @Override
    public void remove(long id) {
        messageRepository.deleteById(id);
    }
}
