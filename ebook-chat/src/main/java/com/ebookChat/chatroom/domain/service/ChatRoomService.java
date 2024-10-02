package com.ebookChat.chatroom.domain.service;

import java.util.List;

import com.ebookChat.chatroom.domain.model.ChatRoom;
import com.ebookChat.chatroom.domain.model.ChatRoomUser;
import com.ebookChat.chatroom.domain.model.InstantMessage;

public interface ChatRoomService {
	
	ChatRoom save(ChatRoom chatRoom);
	ChatRoom findById(String chatRoomId);
	ChatRoom join(ChatRoomUser joiningUser, ChatRoom chatRoom);
	ChatRoom leave(ChatRoomUser leavingUser, ChatRoom chatRoom);
	void sendPublicMessage(InstantMessage instantMessage);
	void sendPrivateMessage(InstantMessage instantMessage);
	List<ChatRoom> findAll();
}
