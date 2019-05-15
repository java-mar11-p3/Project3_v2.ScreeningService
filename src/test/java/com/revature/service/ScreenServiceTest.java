package com.revature.service;

import com.revature.dao.ScreenRepository;
import com.revature.dto.Screen;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
public class ScreenServiceTest {

    @TestConfiguration
    static class TestConfig {
        @Bean
        public ScreenService screenService() {
            return new ScreenServiceImpl();
        }
    }

    @Autowired
    private ScreenService screenService;


    @MockBean
    ScreenRepository repository;


    @Test
    public void testGetScreenByScreeningId() {
        Screen screen = new Screen();
        screen.setId(1);
        screen.setCandidate_id(2);
        screen.setUserId(10);
        screen.setScreeningScore(100);
        screen.setScreeningNotes("GREAT JOB!");
        Mockito.when(repository.findById(1)).thenReturn(Optional.of(screen));
        Screen s = screenService.getScreenById(1);
        System.out.println(s);
        assertNotNull(s);
        assertEquals(1, s.getId());
        assertEquals("GREAT JOB!", s.getScreeningNotes());
    }

    @Test
    public  void testGetAllScreenings() {
        List<Screen> screenList = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(screenList);
        List<Screen> sList = screenService.getAllScreenings();
        assertNotNull(sList);
        assertEquals(screenList, sList);
    }
}
