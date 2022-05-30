package com.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.contact.entity.Contact;
import com.contact.service.ContactService;


@RestController
@RequestMapping("/contact1")
public class ContactController {

	@Autowired
	ContactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId){
	return this.contactService.getContactsOfUser(userId);	
	}
	
	@PostMapping("/")
	public void setContacts(@RequestBody Contact c) {
		System.out.println("Post method called "+c);
		this.contactService.setContact(c);
	}
}
