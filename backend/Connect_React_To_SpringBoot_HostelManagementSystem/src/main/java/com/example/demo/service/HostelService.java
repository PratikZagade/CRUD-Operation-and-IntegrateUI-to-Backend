package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Hostel;

public interface HostelService {
	public void save(Hostel h);
	public  void delete(int id);
	Hostel getHostel(int id);
	public List<Hostel> gethostelAll();

	
}
