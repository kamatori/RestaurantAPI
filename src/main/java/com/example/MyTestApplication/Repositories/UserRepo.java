package com.example.MyTestApplication.Repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.MyTestApplication.Usr;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserRepo extends CrudRepository<Usr, Long> {
        public Optional<Usr> findUserByUniqueDisplayName(String uniqueDisplayName);

}
