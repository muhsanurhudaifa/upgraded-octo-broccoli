/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.muhsanurhudaifa.submission.controller;

import java.util.List;
import me.muhsanurhudaifa.submission.entity.JuniorDeveloper;
import me.muhsanurhudaifa.submission.service.JuniorDeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Muhammad Sadeli Nurhudaifa
 */

@RequestMapping("api/v1/management")
@RestController
public class JuniorDeveloperController {

        @Autowired
    private JuniorDeveloperService juniorDeveloperService;
        
        @PostMapping("/")
    public ResponseEntity<JuniorDeveloper> batchInsert() {
    return null;
    }	
	@GetMapping(value = "/developers")
    public List<JuniorDeveloper> getAll() {
        return juniorDeveloperService.getAll();
    }

        @GetMapping(value = "/developers/{Id}")
    public JuniorDeveloper getDeveloperById(@PathVariable Long Id) {
        return juniorDeveloperService.getDevId(Id);
    }
    
        @GetMapping(value = "/developers/reward/{fullName}")
    public List<String> totalReward(@PathVariable String fullName) {
        return juniorDeveloperService.rewardSummary(fullName);
    }
    
}
