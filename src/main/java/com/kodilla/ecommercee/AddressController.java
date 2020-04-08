package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.AddressDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/ecommercee/address")
public class AddressController {
    @RequestMapping(method = RequestMethod.GET, value = "getAddresses")
    public List<AddressDto> getAddresses() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getAddress")
    public AddressDto getAddress(@RequestParam Long addressId) {
        return new AddressDto(1L, 1L, "test_street", "test_houseNumber",
                "test_city", "test_zip_code", "test_phone_number");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteAddress")
    public void deleteAddress(@RequestParam Long addressId) {
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateAddress")
    public AddressDto updateAddress(@RequestBody AddressDto addressDto) {
        return new AddressDto(1L, 1L, "updated_street", "updated_houseNumber",
                "updated__city", "updated__zip_code", "updated__phone_number");
    }

    @RequestMapping(method = RequestMethod.POST, value = "createAddress")
    public void createAddress(@RequestBody AddressDto addressDto) {
    }
}

