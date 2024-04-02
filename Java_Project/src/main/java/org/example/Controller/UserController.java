package org.example.Controller;
import org.example.Repository.UserRepository;
import org.example.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//@RequestMapping("/api")
//public class UserController {
//    @Autowired
//    private UserRepository userRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody LoginRequest loginRequest) {
//        User user = userRepository.findByEmail(loginRequest.getEmail());
//        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
//            return "Login successful";
//        } else {
//            return "Login failed";
//        }
//    }
//}
//
//
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    // Define other endpoints for user registration and login
}
