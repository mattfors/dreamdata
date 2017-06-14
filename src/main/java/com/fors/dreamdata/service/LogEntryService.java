package com.fors.dreamdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fors.dreamdata.model.LogEntry;
import com.fors.dreamdata.repository.LogEntryRepository;

@Service
public class LogEntryService {
	
	@Autowired
	private LogEntryRepository repository;

	public LogEntry create(LogEntry logEntry){
		return repository.save(logEntry);
	}
}
