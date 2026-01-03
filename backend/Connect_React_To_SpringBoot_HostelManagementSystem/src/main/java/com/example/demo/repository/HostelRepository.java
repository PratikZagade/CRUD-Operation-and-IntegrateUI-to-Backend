package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hostel;

public interface HostelRepository extends JpaRepository<Hostel, Integer> {

}
