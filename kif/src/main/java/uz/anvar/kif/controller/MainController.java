package uz.anvar.kif.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uz.anvar.kif.model.User;
import uz.anvar.kif.service.UserService;

import java.util.List;

@Controller

public class MainController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public String showUserList(Model model) {

        return "index";
    }
    @GetMapping("/teacher")
    public String teacher(){
        return "teacher";
    }

}

