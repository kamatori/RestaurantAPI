package com.example.MyTestApplication.Controller;


import com.example.MyTestApplication.DiningReview;
import com.example.MyTestApplication.Repositories.DiningReviewRepo;
import com.example.MyTestApplication.Repositories.*;
import com.example.MyTestApplication.Usr;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestaurantController {
    private UserRepo userRepository;

    private DiningReviewRepo diningReviewRepository;

    public RestaurantController(UserRepo userRepository, DiningReviewRepo diningReviewRepository) {

        this.userRepository = userRepository;
        this.diningReviewRepository = diningReviewRepository;
    }
    @GetMapping("/hello")
    public String greet(){
        return "Hello";
    }
    @GetMapping("/getReview/{id}")
    public DiningReview diningReview(@PathVariable("id") Long id) {
        if (!this.userRepository.findById(id).isPresent()) {
            return null;

        }

        Optional<DiningReview> diningReviewOptional = this.diningReviewRepository.findById(id);
        DiningReview diningReview = diningReviewOptional.get();
        return diningReview;
    }

    @PostMapping("/postReview")
    @ResponseStatus(HttpStatus.CREATED)
    public DiningReview createDiningReview(@RequestBody DiningReview diningReview) {
    this.diningReviewRepository.save(diningReview);
    return diningReview;

}
}
