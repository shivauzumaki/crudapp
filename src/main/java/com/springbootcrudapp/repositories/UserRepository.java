package com.springbootcrudapp.repositories;

/**
 * Created by Shiva on 4/29/2017.
 */
import com.springbootcrudapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

}