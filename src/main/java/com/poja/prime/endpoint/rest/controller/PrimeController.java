package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.PojaGenerated;
import com.poja.prime.service.event.PrimeService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@Value
public class PrimeController {
  private final PrimeService primeService;

  @GetMapping(value = "/new-prime")
  public String generateNewPrime() {
    return primeService.createNewProbablePrime();
  }
}
