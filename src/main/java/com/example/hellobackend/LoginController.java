//package com.example.hellobackend;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@CrossOrigin(origins = "http://localhost:3001")
//public class LoginController {
//
//    @PostMapping("/login")
//    public String login(@RequestBody Login login) {
//
//        if ("vaishnavi".equals(login.getName())) {
//
//            if ("vaish".equals(login.getPass())) {
//                return "Login Successful";
//            } else {
//                return "Login UnSuccessful";
//            }
//
//        } else {
//            return "Invalid UserName Try again!";
//        }
//    }
//}