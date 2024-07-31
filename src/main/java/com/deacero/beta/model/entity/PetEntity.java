package com.deacero.beta.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(name = "pet")
public class PetEntity {
  @Id private Long id; // El ID se maneja manualmente o se define a través de la base de datos

  private String name;
}
