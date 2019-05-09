package com.revature.service;

import com.revature.dto.Screen;
import com.revature.repository.ScreenRepository;
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
}
