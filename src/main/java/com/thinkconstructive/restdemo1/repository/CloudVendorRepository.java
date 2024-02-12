package com.thinkconstructive.restdemo1.repository;

import com.thinkconstructive.restdemo1.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
}
