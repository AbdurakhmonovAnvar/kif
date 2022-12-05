package uz.anvar.kif.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.anvar.kif.model.User;
import uz.anvar.kif.service.UserService;

import java.util.List;
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
   @Autowired
    private UserService service;

   @PostMapping
   public ResponseEntity<?> createUser(@RequestBody User user){
       User result = service.createUser(user);
       return ResponseEntity.ok(result);
   }

   @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
       List<User> result = service.getAll();
       return ResponseEntity.ok(result);
   }



}
