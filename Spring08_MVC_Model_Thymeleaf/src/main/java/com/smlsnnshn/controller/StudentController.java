package com.smlsnnshn.controller;

import com.smlsnnshn.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","İsmail");

        //create some variables and send to UI
        String name="Sinan";
        String surname="Sahin";
        String course="Cybertek";
        model.addAttribute("name",name);
        model.addAttribute("surname",surname);
        model.addAttribute("course",course);

        //create some random studentId (0-1000) and show it in your UI
        int studentId = new Random().nextInt(1000);
        model.addAttribute("studentId",studentId);

        //create a list object and send it to UI
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        model.addAttribute("numbers",numbers);

        //create a birthday and send it to UI
        LocalDate birthday = LocalDate.now().minusYears(39);
        model.addAttribute("birthday",birthday);

        //create a student object and send to UI
        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "student/welcome";

    }

    @GetMapping("/register")
    public String homePage2(){
        return "student/register";
    }

}
