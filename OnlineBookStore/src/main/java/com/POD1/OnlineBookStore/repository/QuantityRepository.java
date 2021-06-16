package com.POD1.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POD1.OnlineBookStore.entity.Quantity;
@Repository
public interface QuantityRepository extends JpaRepository<Quantity, Long>{

}