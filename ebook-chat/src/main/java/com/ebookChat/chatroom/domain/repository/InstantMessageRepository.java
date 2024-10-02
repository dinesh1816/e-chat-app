package com.ebookChat.chatroom.domain.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.ebookChat.chatroom.domain.model.InstantMessage;

public interface InstantMessageRepository extends CassandraRepository<InstantMessage> {
	
	List<InstantMessage> findInstantMessagesByUsernameAndChatRoomId(String username, String chatRoomId);
}
