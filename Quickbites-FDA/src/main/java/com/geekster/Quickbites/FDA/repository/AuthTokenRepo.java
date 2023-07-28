package com.geekster.Quickbites.FDA.repository;

import com.geekster.Quickbites.FDA.model.AuthenticationToken;
import com.geekster.Quickbites.FDA.model.Foodie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);
    AuthenticationToken findFirstByFoodie(Foodie foodie);

}
