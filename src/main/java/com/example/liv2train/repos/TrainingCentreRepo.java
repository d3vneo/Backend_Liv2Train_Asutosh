package com.example.liv2train.repos;

import com.example.liv2train.models.TrainingCentre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCentreRepo extends JpaRepository<TrainingCentre, String> {
}
