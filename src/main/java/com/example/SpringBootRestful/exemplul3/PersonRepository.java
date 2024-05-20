package com.example.SpringBootRestful.exemplul3;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PersonRepository extends JpaRepository<Person, Integer>{
}
