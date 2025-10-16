package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Chiste;

public interface ChisteRepository extends JpaRepository<Chiste, Integer> {

}
