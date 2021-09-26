package ru.veryprosto.letsCodeSpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.veryprosto.letsCodeSpringBoot.repos.UserRepo;

@Service
public class UserService implements UserDetailsService {
    @Autowired//вариант с этой аннотацией считается устаревшим, можно убрать аннотацию и создать конструктор с этим полем
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }
}