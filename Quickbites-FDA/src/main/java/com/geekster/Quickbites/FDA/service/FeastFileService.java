package com.geekster.Quickbites.FDA.service;

import com.geekster.Quickbites.FDA.model.FeastFile;
import com.geekster.Quickbites.FDA.model.Foodie;
import com.geekster.Quickbites.FDA.repository.FeastFileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FeastFileService {
    @Autowired
    FeastFileRepo feastFileRepo;
    public  List<FeastFile> getAllFeastFile() {
        return feastFileRepo.findAll();
    }
    public void saveFeastFile(FeastFile feastFile) {
        feastFile.setOrderCreationTime(LocalDateTime.now());
        feastFileRepo.save(feastFile);
    }
    public FeastFile getFeastFileForFoodie(Foodie foodie) {
        return feastFileRepo.findFirstByFoodie(foodie);
    }
    public void cancelFeastFile(FeastFile feastFile) {
        feastFileRepo.delete(feastFile);
    }
}
