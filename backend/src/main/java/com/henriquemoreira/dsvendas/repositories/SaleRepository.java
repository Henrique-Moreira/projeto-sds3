package com.henriquemoreira.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquemoreira.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
