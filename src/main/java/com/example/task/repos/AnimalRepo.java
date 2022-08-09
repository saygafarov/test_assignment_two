//package com.example.task.repos;
//
//import com.example.task.domain.Animal;
//import com.example.task.domain.EAnimal;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface AnimalRepo extends JpaRepository<Animal, Long> {
//
//    Optional<Animal> findByType(EAnimal typeAnimal);
//
//    List<Animal> findAnimalByCreatedBy(String username);
//
//    Boolean existsByNickname(String nickname);
//
//}
