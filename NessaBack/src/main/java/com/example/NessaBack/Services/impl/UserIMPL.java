package com.example.NessaBack.Services.impl;

import com.example.NessaBack.Dto.UserDTO;
import com.example.NessaBack.Entities.User;
import com.example.NessaBack.Repositories.UserRepo;
import com.example.NessaBack.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDTO userDTO) {
       User user = new User(
               userDTO.getUserid(),
               userDTO.getUsername(),
               userDTO.getEmail(),
               this.passwordEncoder.encode(userDTO.getPassword()),
               userDTO.getTelNumber(),
               userDTO.getAdresseb(),
               userDTO.getPourcentage(),
               userDTO.getRole()
       );
       userRepo.save(user);
       return user.getUsername();
    }
}
