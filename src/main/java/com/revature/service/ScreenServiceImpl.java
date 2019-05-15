package com.revature.service;

import com.revature.dto.Screen;
import com.revature.dao.ScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ScreenServiceImpl implements ScreenService {

    @Autowired
    ScreenRepository repository;

    @Override
    public List<Screen> getAllScreenings() {
        return repository.findAll();
    }

    @Override
    public Screen getScreenById(int id) {
        return repository.findById(id).get();
    }
    
    

    @Override
    public void addScreen(Screen screen) {
        repository.save(screen);
    }

    @Override
    public void updateScreen(Screen screen, int id) {
        Screen screenToUpdate = repository.findById(id).get();
        screenToUpdate.setScreeningNotes(screen.getScreeningNotes());
        screenToUpdate.setScreeningScore(screen.getScreeningScore());
        repository.save(screenToUpdate);

    }

	@Override
	public List<Screen> getScreenByUserId(int user_id) {
		return repository.getScreenByUserId(user_id);
	}

    @Override
    public List<Screen> getScreenByCandidateId(int candidate_id) {
        return repository.getScreeningsByCandidateId(candidate_id);
    }
}
