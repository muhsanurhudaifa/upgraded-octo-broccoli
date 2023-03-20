/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.muhsanurhudaifa.submission.repository;

import java.util.List;
import me.muhsanurhudaifa.submission.entity.JuniorDeveloper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Muhammad Sadeli Nurhudaifa
 */

@Repository
public interface JuniorDeveloperRepository extends JpaRepository<JuniorDeveloper, Long> {    
    @Query(nativeQuery = true, value = "select id,"
            + "accomplishment_reward,"
            + "full_name,"
            + "given_date "
            + "from developers")
    List<JuniorDeveloper> getAll();
    
    @Query(nativeQuery = true, value = "select id,"
            + "accomplishment_reward,"
            + "full_name,"
            + "given_date "
            + "from developers "
            + "where id = ?")
    JuniorDeveloper getDevId(Long Id);
    
    @Query(nativeQuery = true, value = "select full_name,"
            + "accomplishment_reward "
            + "from developers "
            + "where full_name = ? ")
    List<String> rewardSummary(String fullName);
    
    @Query(nativeQuery = true, value = "insert into developers("
            + "id,"
            + "full_name"
            + "given_date"
            + "values(?,?,?,?)")
    List<JuniorDeveloper> batchInsert(Long Id, Integer accomplishment_reward, String fullName, String given_date);
}