package com.fors.dreamdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fors.dreamdata.model.LogEntry;

public interface LogEntryRepository extends MongoRepository<LogEntry, String>{
	
	LogEntry findByUser(String user);

}
