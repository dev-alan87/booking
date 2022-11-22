package io.github.dev_alan87.booking.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.dev_alan87.booking.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
