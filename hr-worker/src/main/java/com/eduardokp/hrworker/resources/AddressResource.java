package com.eduardokp.hrworker.resources;

import com.eduardokp.hrworker.entities.Address;
import com.eduardokp.hrworker.entities.Worker;
import com.eduardokp.hrworker.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/address")
public class AddressResource {

    @Autowired
    private AddressRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Address> findById(@PathVariable Long id) {
        Optional<Address> optAddress = repository.findById(id);

        return optAddress.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.ok().build());
    }
}
