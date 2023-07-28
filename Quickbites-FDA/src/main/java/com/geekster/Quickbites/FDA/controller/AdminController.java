package com.geekster.Quickbites.FDA.controller;

import com.geekster.Quickbites.FDA.model.Admin;
import com.geekster.Quickbites.FDA.model.CraveCrafter;
import com.geekster.Quickbites.FDA.model.Dto.SignInInput;
import com.geekster.Quickbites.FDA.model.Dto.SignUpOutput;
import com.geekster.Quickbites.FDA.model.Restaurant;
import com.geekster.Quickbites.FDA.service.AdminService;
import com.geekster.Quickbites.FDA.service.CraveCrafterService;
import com.geekster.Quickbites.FDA.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    CraveCrafterService craveCrafterService;
    @Autowired
    RestaurantService restaurantService;

    @PostMapping("admin/signup")
    public SignUpOutput signUpFoodie(@RequestBody Admin admin)    {
        return adminService.signUpAdmin(admin);
    }
    @PostMapping("admin/signIn")
    public String signInAdmin(@RequestBody @Valid SignInInput signInInput)    {
        return adminService.signInAdmin(signInInput);
    }
    // Endpoint to add a new restaurant
    @PostMapping("/restaurant")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant ) {
        return restaurantService.addRestaurant(restaurant);
    }
    // Endpoint to delete a restaurant by ID
    @DeleteMapping("/restaurant/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }
    @PostMapping("/craveCrafter")
    public CraveCrafter addCraveCrafter(@RequestBody CraveCrafter craveCrafter) {
        return craveCrafterService.addCraveCrafter(craveCrafter);
    }
    // Endpoint to delete a crave crafter by ID
    @DeleteMapping("/craveCrafter/{id}")
    public Void deleteCraveCrafter(@PathVariable Long id) {
       craveCrafterService.deleteCraveCrafter(id);
        return null;
    }
}
