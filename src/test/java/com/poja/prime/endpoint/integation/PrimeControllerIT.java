package com.poja.prime.endpoint.integation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.poja.prime.conf.FacadeIT;
import com.poja.prime.endpoint.rest.controller.PrimeController;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class PrimeControllerIT extends FacadeIT {

  @Autowired PrimeController primeController;

  @Test
  void ping() {
    int certainty = 90;
    BigInteger bigInteger = new BigInteger(primeController.generateNewPrime());
    assertTrue(bigInteger.isProbablePrime(certainty));
  }
}
