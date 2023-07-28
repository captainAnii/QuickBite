package com.geekster.Quickbites.FDA.repository;

import com.geekster.Quickbites.FDA.model.FeastFile;
import com.geekster.Quickbites.FDA.model.Foodie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeastFileRepo  extends JpaRepository<FeastFile, Long> {
    FeastFile findFirstByFoodie(Foodie foodie);
}
