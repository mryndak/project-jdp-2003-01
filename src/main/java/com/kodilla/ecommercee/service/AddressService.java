package com.kodilla.ecommercee.service;

import com.kodilla.ecommercee.domain.Address;
import com.kodilla.ecommercee.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address saveOrder(final Address address) {
        return addressRepository.save(address);
    }

    public Address getAddressById(final Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    public void deleteAddress(final Long id) {
        addressRepository.deleteById(id);
    }
}
