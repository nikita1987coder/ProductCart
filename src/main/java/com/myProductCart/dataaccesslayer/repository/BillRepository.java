package com.myProductCart.dataaccesslayer.repository;

import org.springframework.data.repository.CrudRepository;

import com.myProductCart.dataaccesslayer.entity.Bill;

public interface BillRepository extends CrudRepository<Bill, Long> {

}
