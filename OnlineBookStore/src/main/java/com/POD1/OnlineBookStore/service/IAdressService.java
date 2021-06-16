package com.POD1.OnlineBookStore.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.POD1.OnlineBookStore.dto.AddressDto;
import com.POD1.OnlineBookStore.dto.UpdateAddressDto;
import com.POD1.OnlineBookStore.entity.Address;
import com.POD1.OnlineBookStore.entity.Users;

@Repository
public interface IAdressService {

	Address addAddress(AddressDto address, String token);

	Users deleteAddress(String token, Long addressId);

	Address updateAddress(UpdateAddressDto address, String token);

	List<Address> getAllAddress();

	Address getAddress(Long id);

	List<Address> getAddressByUserId(String token);

	Address getAddress(String type, String token);

}
