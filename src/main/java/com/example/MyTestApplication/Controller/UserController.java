package com.example.MyTestApplication.Controller;
import com.example.MyTestApplication.Repositories.UserRepo;
import com.example.MyTestApplication.Usr;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class UserController {
private UserRepo userRepository;

public UserController(UserRepo userRepository){
    this.userRepository = userRepository;
}

    @GetMapping("/findAll")
    public Iterable<Usr> getAllUsers() {

    return this.userRepository.findAll();
    }

    @GetMapping("/helloworld")
    public String index() {

    return "Greetings from Spring Boot!";
        }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Usr createNewUser(@RequestBody Usr newUser) {
        validateUserExists(newUser);
        this.userRepository.save(newUser);
        newUser.getCity();
        newUser.getUniqueDisplayName();
        //Optional userOptional = this.userRepository;
        return newUser;
    }

    @GetMapping("/user/{username}")
    public String getUser(@PathVariable("username") @RequestBody String existingUser) {
        this.userRepository.findUserByUniqueDisplayName(existingUser);
        return existingUser;
    }

    @PutMapping("/updateProfile/{id}")
    public Usr updateUser(@PathVariable("id") Long id, @RequestBody Usr updateUser) {
        Optional<Usr> userToUpdateOptional = this.userRepository.findById(id);
        if (!userToUpdateOptional.isPresent()) {
            return null;
        }
        Usr userToUpdate = userToUpdateOptional.get();
        this.userRepository.save(updateUser);
        return userToUpdate;
    }

    private void validateUserExists(Usr user){
        if (this.userRepository.findUserByUniqueDisplayName(user.getUniqueDisplayName()).isPresent()){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }




}
