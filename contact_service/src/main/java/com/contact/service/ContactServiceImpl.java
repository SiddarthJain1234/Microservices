package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

   List<Contact> list = List.of(
           new Contact(1L, "amit@gmail.com", "Amit", 1311L),
           new Contact(2L, "anil@gmail.com", "Anil", 1311L),
           new Contact(3L, "rohan@gmail.com", "Rohan", 1312L),
           new Contact(4L, "sameer@gmail.com", "Sameer", 1314L),
           new Contact(6L, "jainsiddarth93@gmail.com", "Siddarth", 1313L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }


	@Override
	public void setContact(Contact c) {
		List<Contact> arraylist=new ArrayList<Contact>(this.list);
		arraylist.add(c);
		list=arraylist;
	}
}