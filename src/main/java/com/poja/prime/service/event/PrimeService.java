package com.poja.prime.service.event;

import com.poja.prime.PojaGenerated;
import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class PrimeService {

  public String createNewProbablePrime() {
    int bitLength = 1_000;
    BigInteger probablePrime = BigInteger.probablePrime(bitLength, new java.util.Random());
    return probablePrime.toString();
  }
}
