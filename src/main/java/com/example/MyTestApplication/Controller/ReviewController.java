package com.example.MyTestApplication.Controller;

import com.example.MyTestApplication.Repositories.DiningReviewRepo;
import com.example.MyTestApplication.Repositories.UserRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
    private UserRepo userRepository;
    private DiningReviewRepo diningReviewRepository;
    public ReviewController(UserRepo userRepository, DiningReviewRepo diningReviewRepository){
        this.userRepository = userRepository;
        this.diningReviewRepository = diningReviewRepository;
    }


}
