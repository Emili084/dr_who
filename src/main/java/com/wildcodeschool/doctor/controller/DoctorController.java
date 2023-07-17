package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody

    public Doctor doctor(@PathVariable int number) {
if (number == 13) {
    return new Doctor(13, "Jodie");
} else if (number > 0 && number < 13) {
    return new Doctor(number, "statut 303");
} else if (number > 13) {
    return new Doctor(number, "statut 404 Impossible de récupérer l'incarnation " + number);
}
return null;
    }
}
