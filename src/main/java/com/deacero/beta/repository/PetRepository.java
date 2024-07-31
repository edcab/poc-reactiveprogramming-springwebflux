package com.deacero.beta.repository;

import com.deacero.beta.model.entity.PetEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface PetRepository extends R2dbcRepository<PetEntity, Long> {
  @Query("SELECT pet.ID, pet.NAME FROM pet WHERE pet.NAME = ?")
  Flux<PetEntity> findByName(String name);

}
