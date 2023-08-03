package com.example.demo.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private final AddressRepositoy addressRepositoy;
    public AddressService(AddressRepositoy addressRepositoy) {
        this.addressRepositoy = addressRepositoy;
    }
}
