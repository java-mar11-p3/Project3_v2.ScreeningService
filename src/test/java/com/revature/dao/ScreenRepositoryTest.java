package com.revature.dao;

import com.revature.dto.Screen;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ScreenRepositoryTest {

    @Autowired TestEntityManager em;

    @Autowired ScreenRepository screenRepository;

    @Test
    public void testFindById() {
        Screen s = new Screen();
        s.setScreeningNotes("This is a note!");
        em.merge(s);
        em.flush();

        Screen screen = screenRepository.findById(1).get();

        assertNotNull(screen);
        Assertions.assertThat(screen.getId()).isGreaterThan(0);
    }

    @Test
    public void testFindAll() {
        List<Screen> screenList = screenRepository.findAll();
        List<Screen> emptyList = new ArrayList<>();
        assertEquals(emptyList, screenList);

    }



}
