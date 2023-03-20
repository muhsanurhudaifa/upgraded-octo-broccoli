/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.muhsanurhudaifa.submission.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Muhammad Sadeli Nurhudaifa
 */

@Data
@Entity

@Table(name = "developers")
public class JuniorDeveloper {
    @Id
    @Column(name = "id")
    private Long Id;

    @Column(name = "full_name")
    private String fullName;
    
    @Column(name = "given_date")
    private Timestamp givenDate;
    
    @Column(name = "accomplishment_reward")
    private Integer accomplishmentReward;
        
    public void setId(Long Id) {
        this.Id = Id;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public void setGivenDate(Timestamp givenDate) {
        this.givenDate = givenDate;
    }
    
    public void setAcommplishmentReward(Integer accomplishmentReward) {
        this.accomplishmentReward = accomplishmentReward;
    }
    
    public static JuniorDeveloperBuilder builder() {
        return new JuniorDeveloperBuilder();
    }
    
    @Override
    public String toString() {
        return "JuniorDeveloper{Id=" + Id + ", fullName=" + fullName + ", givenDate=" + givenDate + ", accomplishmentReward=" + accomplishmentReward + "}";
    }

    public static class JuniorDeveloperBuilder {
        private JuniorDeveloper jd;
        
        public JuniorDeveloperBuilder() {
            jd = new JuniorDeveloper();
        }
        
        public JuniorDeveloper build() {
            return jd;        
        }
        
        public JuniorDeveloperBuilder Id(Long Id) {
            jd.setId(Id);
            return this;
        }
        
        public JuniorDeveloperBuilder fullName(String fullName) {
            jd.setFullName(fullName);
            return this;
        }
        
        public JuniorDeveloperBuilder givenDate(Timestamp givenDate) {
            jd.setGivenDate(givenDate);
            return this;
        }
        
        public JuniorDeveloperBuilder accomplishmentReward(Integer accomplishmentReward) {
            jd.setAccomplishmentReward(accomplishmentReward);
            return this;
        }
    }
}

//insert into developers (id, accomplishment_reward, full_name, given_date) values (1, 17634, 'Alida Kalkofen', '2023-03-11 09:23:51');
//insert into developers (id, accomplishment_reward, full_name, given_date) values (2, 19295, 'Alida Kalkofen', '2023-03-13 12:00:38');
//insert into developers (id, accomplishment_reward, full_name, given_date) values (3, 11621, 'Alida Kalkofen', '2023-03-17 16:14:55');
//insert into developers (id, accomplishment_reward, full_name, given_date) values (4, 16398, 'Eloisa Larmett', '2023-03-18 19:56:28');
//insert into developers (id, accomplishment_reward, full_name, given_date) values (5, 14351, 'Jarid McAndrew', '2023-03-17 09:28:50');
//insert into developers (id, accomplishment_reward, full_name, given_date) values (6, 19903, 'Livvyy Earingey', '2023-03-16 19:30:20');
//insert into developers (id, accomplishment_reward, full_name, given_date) values (7, 10723, 'Carrie Ethelston', '2023-03-15 22:26:50');
//insert into developers (id, accomplishment_reward, full_name, given_date) values (8, 16818, 'Gerrilee Saterweyte', '2023-03-13 07:30:31');
//insert into developers (id, accomplishment_reward, full_name, given_date) values (9, 17517, 'Stanislas Sumbler', '2023-03-15 14:27:15');
//insert into developers (id, accomplishment_reward, full_name, given_date) values (10, 12578, 'Berk Quilter', '2023-03-11 13:28:26');