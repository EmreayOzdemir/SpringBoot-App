package com.form.controller;

import com.form.controller.dataGenerator.DataGenerator;
import com.form.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Arrays;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/register")
    public String employeeCreate(Model model){

        model.addAttribute("employee", new Employee());
        model.addAttribute("stateList", DataGenerator.getStateList());

        return "/employee/employee-create";
    }
    @PostMapping("/list")
    public String employeeList(@ModelAttribute("employee") Employee employee, Model model){

        model.addAttribute("employeeList", Arrays.asList(employee));

        int birthYear= LocalDate.parse(employee.getBirthdate()).getYear();
        model.addAttribute("age", LocalDate.now().getYear()-birthYear);

        return "employee/employee-list";
    }

}