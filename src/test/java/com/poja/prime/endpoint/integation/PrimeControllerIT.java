package com.poja.prime.endpoint.integation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.poja.prime.conf.FacadeIT;
import com.poja.prime.endpoint.rest.controller.PrimeController;
import com.poja.prime.model.entity.PrimeEntity;
import java.math.BigInteger;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;

class PrimeControllerIT extends FacadeIT {

  @Autowired PrimeController primeController;

  @Test
  @DirtiesContext
  void can_generate_prime() {
    int certainty = 90;
    BigInteger bigInteger = new BigInteger(primeController.generateNewPrime());
    assertTrue(bigInteger.isProbablePrime(certainty));
  }

  @Test
  @DirtiesContext
  void can_get_last_10_prime() {
    String bigInteger1 = primeController.generateNewPrime();
    String bigInteger2 = primeController.generateNewPrime();
    String bigInteger3 = primeController.generateNewPrime();
    String bigInteger4 = primeController.generateNewPrime();
    String bigInteger5 = primeController.generateNewPrime();
    String bigInteger6 = primeController.generateNewPrime();
    String bigInteger7 = primeController.generateNewPrime();
    String bigInteger8 = primeController.generateNewPrime();
    String bigInteger9 = primeController.generateNewPrime();
    String bigInteger10 = primeController.generateNewPrime();
    String bigInteger11 = primeController.generateNewPrime();

    List<PrimeEntity> actual = primeController.getLastPrimes();
    List<String> actualValues = actual.stream().map(PrimeEntity::getValue).toList();
    assertEquals(10, actual.size());
    assertTrue(actualValues.contains(bigInteger2));
    assertTrue(actualValues.contains(bigInteger3));
    assertTrue(actualValues.contains(bigInteger4));
    assertTrue(actualValues.contains(bigInteger5));
    assertTrue(actualValues.contains(bigInteger6));
    assertTrue(actualValues.contains(bigInteger7));
    assertTrue(actualValues.contains(bigInteger8));
    assertTrue(actualValues.contains(bigInteger9));
    assertTrue(actualValues.contains(bigInteger10));
    assertTrue(actualValues.contains(bigInteger11));
  }
}
