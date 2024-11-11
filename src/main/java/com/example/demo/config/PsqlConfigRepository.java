package com.example.demo.config;

import com.example.demo.model.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsqlConfigRepository extends JpaRepository <Config, Long> {
}
