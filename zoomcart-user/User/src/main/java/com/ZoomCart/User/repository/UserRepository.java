package com.ZoomCart.User.repository;

import com.ZoomCart.User.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserId(Integer userId);

    void deleteById(Integer userId);

    User getUserByUserId(Integer userId);

    boolean existsByEmail(String userEmail);

    Optional<User> findByEmailAndRole(String email, String role);
}
