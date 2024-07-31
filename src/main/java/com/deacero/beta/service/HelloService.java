package com.deacero.beta.service;

import com.deacero.beta.model.dto.PetDto;
import reactor.core.publisher.Flux;

public interface HelloService {
  Flux<PetDto> getPetByName(String name);
}
