package com.example.demo.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepositoy extends JpaRepository<Address, Long>{
}
