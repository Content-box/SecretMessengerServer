package com.kohb.superchat.server.service;

import com.kohb.superchat.server.entity.Message;
import com.kohb.superchat.server.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Message> getMessageChatId(long chatId) {
        return messageRepository.findByChatId(chatId);
    }

    @Override
    public Message getById(long id) {
        return messageRepository.findById(id);
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
