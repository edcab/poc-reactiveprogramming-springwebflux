package com.deacero.beta.service.impl;

import com.deacero.beta.mapping.PetMapping;
import com.deacero.beta.model.dto.PetDto;
import com.deacero.beta.repository.PetRepository;
import com.deacero.beta.service.HelloService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class HelloServiceImpl implements HelloService {

  private final PetRepository petRepository;
  private final PetMapping petMapping;

  @Override
  public Flux<PetDto> getPetByName(String name) {

    return petRepository
        .findByName(name) // Asume que este método devuelve un Flux<PetEntity>
        .map(petMapping::toPetDto); // Convierte cada PetEntity a PetDto
  }
}
