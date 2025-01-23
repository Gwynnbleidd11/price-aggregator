package com.example.price_aggregator.user.service;

import com.example.price_aggregator.user.controller.UserNotFoundException;
import com.example.price_aggregator.user.domain.User;
import com.example.price_aggregator.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(final User user) {
        return userRepository.save(user);
    }

    public User getUser(final UUID userId) throws UserNotFoundException {
        return userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(final UUID userId) {
        userRepository.deleteById(userId);
    }
}
