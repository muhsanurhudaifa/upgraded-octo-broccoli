/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.muhsanurhudaifa.submission.service.impl;

import java.util.List;
import me.muhsanurhudaifa.submission.entity.JuniorDeveloper;
import me.muhsanurhudaifa.submission.repository.JuniorDeveloperRepository;
import me.muhsanurhudaifa.submission.service.JuniorDeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alhena
 */
@Service
public class JuniorDeveloperServiceImpl implements JuniorDeveloperService {

    @Autowired
    private JuniorDeveloperRepository juniorDeveloperRepository;

    @Override
    public List<JuniorDeveloper> getAll() {
        return juniorDeveloperRepository.getAll();
    }

    @Override
    public JuniorDeveloper getDevId(Long Id) {
        return juniorDeveloperRepository.getDevId(Id);
    }

    @Override
    public List<String> rewardSummary(String fullName) {
        return juniorDeveloperRepository.rewardSummary(fullName);
    }

}
