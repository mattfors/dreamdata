package com.fors.dreamdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fors.dreamdata.model.LogEntry;
import com.fors.dreamdata.service.LogEntryService;

@RestController
@RequestMapping("/logentry")
public class LogEntryController {
	
	@Autowired
	private LogEntryService logEntryService;
	
	@RequestMapping(method = RequestMethod.POST)
    public LogEntry home(@RequestBody LogEntry logEntry) {
        return logEntryService.create(logEntry);
    }

}
