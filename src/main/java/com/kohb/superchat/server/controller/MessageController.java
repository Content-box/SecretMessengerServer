package com.kohb.superchat.server.controller;

import com.kohb.superchat.server.entity.Message;
import com.kohb.superchat.server.repository.MessageRepository;
import com.kohb.superchat.server.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //все методы контроллера возвр только json
//@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value ="/messages", method = RequestMethod.GET)
    @ResponseBody
    public List<Message> getAllMessages(){

        return messageService.getAll();
    }

    @RequestMapping(value ="/messages/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Message getMessage(@PathVariable("id") long messageId) {

        return messageService.getById(messageId);
    }

    @RequestMapping(value ="/messages_custom/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Message getMessageCustom(@PathVariable("id") long messageId) {

        return messageService.getByIdCustom(messageId);
    }

    @RequestMapping(value ="/messages", method = RequestMethod.POST)
    @ResponseBody
    public Message saveMessage(@RequestBody Message message) {

        return messageService.save(message);
    }

    @RequestMapping(value ="/messages/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteMessage(@PathVariable("id") long messageId) {

        messageService.remove(messageId);
    }

    @RequestMapping(value ="/messages_chat/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Message> getMessageFromChat(@PathVariable("id") long chatId) {

        return messageService.getMessageChatId(chatId);
    }

}
