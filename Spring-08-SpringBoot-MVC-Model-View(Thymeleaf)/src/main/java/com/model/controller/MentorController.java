package com.model.controller;


import com.model.enums.Gender;
import com.model.modelMVC.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @GetMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList=new ArrayList<>();
        mentorList.add(new Mentor("Emray", "Pala", 32, Gender.FEMALE));
        mentorList.add(new Mentor("Emly", "Poul", 36, Gender.FEMALE));
        mentorList.add(new Mentor("Emry", "Pixel", 38, Gender.FEMALE));
        model.addAttribute("mentors", mentorList);
        return "mentor/mentor-list";
    }
}
