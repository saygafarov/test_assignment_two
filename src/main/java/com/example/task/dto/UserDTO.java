//package com.example.task.dto;
//
//import lombok.Data;
//
//import javax.validation.constraints.Size;
//import java.util.Set;
//
//public class UserDTO {
//    @Data
//    public static class Create {
//        private Long id;
//        private String username;
//        private String password;
//    }
//
//    @Data
//    public static class Response {
//        private Long id;
//        private String username;
//        private Set<String> authorities;
//    }
//
//    public static class Login {
//        private String login;
//        @Size(min = 4, max = 12)
//        private String password;
//    }
//}
