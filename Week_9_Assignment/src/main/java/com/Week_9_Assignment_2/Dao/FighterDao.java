package com.Week_9_Assignment_2.Dao;

import com.Week_9_Assignment_2.Entities.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FighterDao extends JpaRepository <Fighter, String>{
}
