package com.address.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.address.entity.Address;
@Service
public class AddressServiceImpl implements AddressService{

	
	List<Address> list = List.of(
				new Address("Sumer nagar", "Mansarovar", "Jaipur", "Rajasthan",302020,1313L),
				new Address("Minarva", "Gopalgarh", "Bharatpur", "Raj", 1234, 1314L)
			);

	
	
	
	@Override
	public List<Address> getAddress(Long id) {
		// TODO Auto-generated method stub
		int tmp=0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getUserId()==id) {
				tmp=i;
				break;
			}
		}
		
		return list.subList(tmp, tmp+1);
	}

}
