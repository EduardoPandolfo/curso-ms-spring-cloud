package com.eduardokp.hrworker.repositories;

import com.eduardokp.hrworker.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
