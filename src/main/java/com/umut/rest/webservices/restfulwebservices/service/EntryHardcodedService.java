package com.umut.rest.webservices.restfulwebservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.umut.rest.webservices.restfulwebservices.bean.Entry;

@Service
public class EntryHardcodedService {
	
	private static List<Entry> entries = new ArrayList<Entry>();
	
	private static int idCounter = 0;
	
	static {
		entries.add(new Entry(++idCounter,"umut","essay","https://www.mavikol.com/wp-content/uploads/2019/05/Pathologic-2-001.jpg","Title1","SubTitle1","MainBody1"));
		entries.add(new Entry(++idCounter,"deniz","new","https://gamergiller.com/wp-content/uploads/2019/12/Disco-Elysium.jpg","Title2","SubTitle2","MainBody2"));

	}
	
	public Entry save(Entry entry) {
		if(entry.getId() == -1 || entry.getId() == 0) {
			entry.setId(++idCounter);
			entries.add(entry);
		}else {
			deleteOne(entry.getId());
			entries.add(entry);
		}
		return entry;
	}
	
	public List<Entry> findAll(){
		return entries;
	}
	
	public Entry deleteOne(long id) {
		Entry entry = findById(id);
		if(entry==null) {
			return null;
		}
		if(entries.remove(entry)) {
			return entry;
		}
		return null;
	}

	public Entry findById(long id) {
		for(Entry entry:entries) {
			if(entry.getId() == id){
				return entry;
			}
		}
		return null;
	}
}
