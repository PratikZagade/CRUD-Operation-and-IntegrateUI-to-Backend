package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hostel;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.HostelRepository;

@Service
public class HostelServiceimpl implements HostelService {

    @Autowired
    HostelRepository hostelrepository;

    @Override
    public void save(Hostel h) {
        hostelrepository.save(h);
    }

    @Override
    public void delete(int id) {
        Hostel hostel = hostelrepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hostel not found with id: " + id));

        hostelrepository.delete(hostel);
    }

    @Override
    public Hostel getHostel(int id) {
        return hostelrepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hostel not found with id: " + id));
    }

    @Override
    public List<Hostel> gethostelAll() {
        return hostelrepository.findAll();
    }
}
