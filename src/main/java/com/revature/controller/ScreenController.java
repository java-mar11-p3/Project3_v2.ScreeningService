package com.revature.controller;

import com.revature.dto.Screen;
import com.revature.service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/screenings")
public class ScreenController {

    @Autowired
    private ScreenService screenService;

    @GetMapping
    public List<Screen> getAllScreenings() {
        return screenService.getAllScreenings();
    }

    @GetMapping("/{id}")
    public Screen getScreeningById(@PathVariable int id) {
        return screenService.getScreenById(id);
    }

    @PostMapping
    public void addScreening(@RequestBody Screen screen) {
        screenService.addScreen(screen);
    }


    @PutMapping("/{id}")
    public void updateScreen(@RequestBody Screen screen, @PathVariable int id) {
        screenService.updateScreen(screen, id);
    }

}
