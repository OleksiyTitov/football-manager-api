package com.footballmanager.repository;

import com.footballmanager.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PLayerRepository extends JpaRepository<Player, Long> {
}