package com.POD1.OnlineBookStore.dto;
import org.springframework.stereotype.Component;
import com.POD1.OnlineBookStore.entity.Address;

import lombok.Data;

@Data
@Component
public class CustomerDto {
	
	private String Name;
	private long Phonenumber;
	private Address Home;
	private Address Work;
	private Address Other;
	
	
}