package com.example.project_leap_25cc061_thiya.Controller;

import com.example.project_leap_25cc061_thiya.Model.details;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    public int calculate() {
        return 100 + 20;
    }

    @PostMapping("/calculate")
    String calculateString() {
        return "SwathiSowbeeThiya";
    }

    @GetMapping("/details")
    public details getDetails() {

        details d = new details();

        d.setName("Aravind");
        d.setDept("CCE");
        d.setRollNo(12);
        d.setActive(true);
        d.setUsername("aravind10");

        return d;
    }
}