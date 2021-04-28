package com.umut.rest.webservices.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.umut.rest.webservices.restfulwebservices.bean.Entry;
import com.umut.rest.webservices.restfulwebservices.service.EntryHardcodedService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EntriesController {
	
	@Autowired
	private EntryHardcodedService entryHardcodedService;
	
	@GetMapping("/entries")
	public List<Entry> getAllTodos(){
		return entryHardcodedService.findAll();
	}
	
	@GetMapping("/entries/{id}")
	public Entry getTodo(@PathVariable long id){
		return entryHardcodedService.findById(id);
	}
	
	@DeleteMapping("/entries/{id}")
	public ResponseEntity<Void> deleteATodo(@PathVariable long id) {
		Entry entry = entryHardcodedService.deleteOne(id);
		if(entry!=null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/entries")
	public Entry createATodo(@RequestBody Entry entry) {
		Entry createdEntry = entryHardcodedService.save(entry);
		//Location
		//Get current resource url - {id}
		return createdEntry;
	}
}
