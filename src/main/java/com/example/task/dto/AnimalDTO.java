//package com.example.task.dto;
//
//import com.example.task.domain.Animal;
//import com.example.task.domain.EAnimal;
//import com.fasterxml.jackson.annotation.JsonFormat;
//import lombok.Data;
//
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import java.time.LocalDate;
//
//@Data
//public class AnimalDTO {
//    private long id;
//    private String nickname;
//    private String gender;
//    @JsonFormat(shape = JsonFormat.Shape.STRING
//            , pattern = "yyyy-MM-dd")
//    private LocalDate birthday;
//    @Enumerated(EnumType.STRING)
//    private EAnimal typeAnimal;
//    private Long userId;
//    private String createdBy;
//
//    public AnimalDTO() {
//    }
//
//    public AnimalDTO(Animal animal) {
//        this.id = animal.getId();
//        this.nickname = animal.getNickname();
//        this.gender = animal.getGender();
//        this.birthday = animal.getBirthday();
//        this.typeAnimal = animal.getTypeAnimal();
//        this.userId = animal.getUser().getId();
//        this.createdBy = animal.getCreatedBy();
//    }
//}
