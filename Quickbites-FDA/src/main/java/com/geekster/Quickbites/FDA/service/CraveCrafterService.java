package com.geekster.Quickbites.FDA.service;

import com.geekster.Quickbites.FDA.model.CraveCrafter;
import com.geekster.Quickbites.FDA.repository.CraveCrafterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CraveCrafterService {
    @Autowired
    CraveCrafterRepo craveCrafterRepo;
    public CraveCrafter addCraveCrafter(CraveCrafter craveCrafter) {
        return  craveCrafterRepo.save(craveCrafter);
    }
    public void deleteCraveCrafter(Long id) {
        craveCrafterRepo.deleteById(id);
    }
    public List<CraveCrafter> getAllCraveCrafters() {
        return craveCrafterRepo.findAll();
    }
}
