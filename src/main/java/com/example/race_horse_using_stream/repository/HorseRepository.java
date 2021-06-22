package com.example.race_horse_using_stream.repository;

import com.example.race_horse_using_stream.model.entities.Horse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorseRepository extends JpaRepository<Horse, Long> {
}
