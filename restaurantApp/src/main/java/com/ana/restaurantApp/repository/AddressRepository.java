package com.ana.restaurantApp.repository;

import com.ana.restaurantApp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
