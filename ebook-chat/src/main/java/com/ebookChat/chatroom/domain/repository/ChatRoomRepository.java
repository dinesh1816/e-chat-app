package com.ebookChat.chatroom.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.ebookChat.chatroom.domain.model.ChatRoom;

public interface ChatRoomRepository extends CrudRepository<ChatRoom, String> {

}
