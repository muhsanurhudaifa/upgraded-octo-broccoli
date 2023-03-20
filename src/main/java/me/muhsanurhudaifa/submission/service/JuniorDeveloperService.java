/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.muhsanurhudaifa.submission.service;

import java.util.List;
import me.muhsanurhudaifa.submission.entity.JuniorDeveloper;

/**
 *
 * @author Alhena
 */
public interface JuniorDeveloperService {
    List<JuniorDeveloper> getAll();
    JuniorDeveloper getDevId(Long Id);
    List<String> rewardSummary(String fullName);
}
