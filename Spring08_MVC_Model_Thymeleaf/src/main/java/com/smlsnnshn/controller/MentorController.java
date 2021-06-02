package com.smlsnnshn.controller;

import com.smlsnnshn.enums.Gender;
import com.smlsnnshn.model.Mentor;
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

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Sinan","Sahin",45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks", 39, Gender.MALE));
        mentorList.add(new Mentor("Julia","Roberts", 35, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";

    }
}
