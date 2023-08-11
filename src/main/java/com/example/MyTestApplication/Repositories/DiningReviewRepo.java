package com.example.MyTestApplication.Repositories;

import com.example.MyTestApplication.DiningReview;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiningReviewRepo extends CrudRepository<DiningReview, Long> {
   List<DiningReview> findBySubmittedBy(String submittedBy);
}
