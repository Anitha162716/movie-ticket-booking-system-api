package com.example.movieticketbookingsystem.security;

import com.example.movieticketbookingsystem.entity.UserDetails;
import com.example.movieticketbookingsystem.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

        private final UserRepository userRepository;

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

            com.example.movieticketbookingsystem.entity.UserDetails user = userRepository.findByEmail(username);

            if(user == null)
                throw new UsernameNotFoundException("Email not found in the database");

            return (UserDetails) User.builder()
                    .username(user.getEmail())
                    .password(user.getPassword())
                    .authorities(user.getUserRole().name())
                    .build();
        }

    }

