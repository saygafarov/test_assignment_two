//package com.example.task.security;
//
//import com.example.task.domain.User;
//import com.example.task.repos.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//
//@Transactional
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    UserRepo userRepo;
//
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepo
//                .findByUsername(username)
//                .orElseThrow(()-> new UsernameNotFoundException("Username not found " + username));
//        return UserDetailsImpl.build(user);
//    }
//
//    @Transactional
//    public UserDetailsImpl loadUserById(Long id) {
//        User user = userRepo.findById (id).orElseThrow (
//                () -> new ApiException ("User not found ", HttpStatus.NOT_FOUND)
//        );
//
//        return UserDetailsImpl.build (user);
//    }
//}
