package com.deacero.beta.controller.integration;

import com.deacero.beta.model.dto.PetDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient
class HelloPetApiControllerTest {

  @Autowired private WebTestClient webTestClient;

  private PetDto petDto;

  @BeforeEach
  public void setUp() {
    petDto = new PetDto();
    petDto.setId(1L);
    petDto.setName("Bobby");
  }

  @Test
  void testFindPetsByName() {
    webTestClient
        .get()
        .uri(
            uriBuilder ->
                uriBuilder.path("/api/v2/pet/findByName").queryParam("name", "Bobby").build())
        .accept(MediaType.APPLICATION_JSON)
        .exchange()
        .expectStatus()
        .isNotFound();
  }
}
