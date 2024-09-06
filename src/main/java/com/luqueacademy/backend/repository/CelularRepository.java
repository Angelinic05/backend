// src/main/java/com/luqueacademy/backend/repository/CelularRepository.java
package com.luqueacademy.backend.repository;

import com.luqueacademy.backend.model.Celular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CelularRepository extends JpaRepository<Celular, Integer> {
    // Puedes definir métodos de consulta adicionales aquí si es necesario
}
