package com.jsp.HomeServo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.HomeServo.dto.Vendor;

public interface VendorRepo  extends JpaRepository<Vendor, Integer>{
	//here don't required @Query annotation because JVM will undastand the findByEmail method name
		public Vendor findByEmail(String email);
		
}
