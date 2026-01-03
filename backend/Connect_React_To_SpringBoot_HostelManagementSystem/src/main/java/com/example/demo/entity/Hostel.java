package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "connectUI_Backend")
public class Hostel {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;
	private String address;
	private String typeOfHostel;
	private int capacity;
	private int rent;
	private String ownerName;
	private String contactNumber;
	private int numberOfRooms;
	private String facilities;
	private int rating;

}
