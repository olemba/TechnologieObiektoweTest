package com.example.repositories;

import com.example.dao.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by Tomasz on 25.11.2016.
 */
public interface PacientRepository extends JpaRepository<Pacient, Integer> {
}
