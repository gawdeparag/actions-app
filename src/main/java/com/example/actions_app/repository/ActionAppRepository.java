package com.example.actions_app.repository;

import com.example.actions_app.entity.ActionAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionAppRepository extends JpaRepository<ActionAppEntity, Long> {
}
