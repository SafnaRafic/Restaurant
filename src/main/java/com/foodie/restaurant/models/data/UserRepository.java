package com.foodie.restaurant.models.data;

import com.foodie.restaurant.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
