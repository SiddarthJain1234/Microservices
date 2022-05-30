package com.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.address.entity.*;
import com.address.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	

	@RequestMapping("/user/{userId}")
	public List<Address> getAddress(@PathVariable("userId") Long userId){
		return addressService.getAddress(userId);
	} 
}
