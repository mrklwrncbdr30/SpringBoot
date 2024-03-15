package com.example.demo.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    public List<Admin> getAllAdmin() {
        return adminService.getAllAdmin();
    }

    @GetMapping("/{admin_id}")
    public Admin getAdminById(@PathVariable Long admin_id) {
        return adminService.getAdminById(admin_id);
    }

    @PostMapping
    public ResponseEntity<?> saveAdmin(@RequestBody Admin admin) {
        try {
            Admin savedAdmin = adminService.saveAdmin(admin);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedAdmin);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while saving the instructor.");
        }
    }
}
