package com.example.NessaBack.Repositories;

import com.example.NessaBack.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
