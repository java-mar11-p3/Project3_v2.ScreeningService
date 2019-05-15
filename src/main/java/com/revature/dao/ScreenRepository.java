package com.revature.dao;

import com.revature.dto.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Integer> {
	Screen getScreenByUserId(int user_id);

}
