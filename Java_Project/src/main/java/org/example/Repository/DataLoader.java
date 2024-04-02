package org.example.Repository;

import org.example.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
//        User admin = new User("Vamshi@gmail.com", "12345678");
//        userRepository.save(admin);
        User admin = new User();
        admin.setEmail("Vamshi@gmail.com");
        admin.setPassword("12345678");
        userRepository.save(admin);
    }
}