//package com.example.task.domain;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.validator.constraints.Length;
//import org.springframework.data.annotation.CreatedBy;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "animals")
//@Getter
//@Setter
//public class Animal {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "a_id")
//    private Long id;
//
//    @Column(name = "a_nickname", nullable = false)
//    @Length(min = 1)
//    private String nickname;
//
//    @Column(name = "a_gender")
//    private String gender;
//
//    @Column(name = "a_birthday")
//    @JsonFormat(shape = JsonFormat.Shape.STRING
//            , pattern = "yyyy-MM-dd")
//    private LocalDate birthday;
//
//    @Enumerated(EnumType.STRING)
//    private EAnimal typeAnimal;
//
//
//    @ManyToOne
//    @JsonManagedReference
//    @JoinColumn(name = "user_u_id"
//            , referencedColumnName = "user_u_id"
//            , nullable = false)
//    @NotNull
//    private User user;
//
//    @CreatedBy
//    @Column(name = "a_created_by", length = 50, updatable = false)
//    private String createdBy;
//
//    public Animal() {
//    }
//
//    public Animal(String nickname, String gender, LocalDate birthday, EAnimal typeAnimal) {
//        this.nickname = nickname;
//        this.gender = gender;
//        this.birthday = birthday;
//        this.typeAnimal = typeAnimal;
//    }
//}
