package com.example.demo.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Long admin_id) {
        return adminRepository.findById(admin_id).orElse(null);
    }

    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
