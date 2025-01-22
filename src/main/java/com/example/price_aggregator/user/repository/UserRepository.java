package com.example.price_aggregator.user.repository;

import com.example.price_aggregator.user.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

    @Override
    List<User> findAll();
}
