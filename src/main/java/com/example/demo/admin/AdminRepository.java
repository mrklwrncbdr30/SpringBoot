package com.example.demo.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface AdminRepository extends JpaRepository<Admin, Long>{
}
