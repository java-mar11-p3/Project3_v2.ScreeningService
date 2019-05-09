package com.revature.controller;

import com.revature.dto.Screen;
import com.revature.service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/screenings")
public class ScreenController {

    @Autowired
    private ScreenService screenService;

    @GetMapping
    public List<Screen> list() {
        System.out.println(screenService.getAllScreenings());
        return screenService.getAllScreenings();
    }
}
