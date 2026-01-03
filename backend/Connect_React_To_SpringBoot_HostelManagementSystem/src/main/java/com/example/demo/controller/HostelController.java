package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Hostel;
import com.example.demo.service.HostelService;

@RestController
@RequestMapping("/hostels")
public class HostelController {

    @Autowired
    HostelService hostelservice;

    @PostMapping
    public String addHostel(@RequestBody Hostel h) {
        hostelservice.save(h);
        return "Added Hostel Information";
    }

    @DeleteMapping("/{id}")
    public String deleteHostel(@PathVariable int id) {
        hostelservice.delete(id);
        return "Deleted Hostel Information";
    }

    @GetMapping("/{id}")
    public Hostel getHostel(@PathVariable int id) {
        return hostelservice.getHostel(id);
    }

    @GetMapping
    public List<Hostel> getAllHostels() {
        return hostelservice.gethostelAll();
    }
}
