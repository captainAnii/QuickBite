package com.geekster.Quickbites.FDA.repository;

import com.geekster.Quickbites.FDA.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Long> {
    Admin findFirstByEmail(String newEmail);
}
