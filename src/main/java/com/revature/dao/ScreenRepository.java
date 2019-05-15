package com.revature.dao;

import com.revature.dto.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Integer> {
	List<Screen> getScreenByUserId(int user_id);
	List<Screen> getScreeningsByCandidateId(int candidate_id);

}
