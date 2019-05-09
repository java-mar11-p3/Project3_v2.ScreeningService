package com.revature.service;


import com.revature.dto.Screen;
import java.util.List;


public interface ScreenService {
   public List<Screen> getAllScreenings();
   public Screen getScreenByScreeningId(int id);
}
