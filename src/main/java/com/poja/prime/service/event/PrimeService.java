package com.poja.prime.service.event;

import com.poja.prime.PojaGenerated;
import com.poja.prime.model.entity.PrimeEntity;
import com.poja.prime.repository.PrimeRepository;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class PrimeService {
  private final PrimeRepository primeRepository;

  public String createNewProbablePrime() {
    int bitLength = 1_000;
    BigInteger probablePrime = BigInteger.probablePrime(bitLength, new java.util.Random());
    PrimeEntity primeEntity =
        primeRepository.save(
            PrimeEntity.builder()
                .value(probablePrime.toString())
                .creationDatetime(Instant.now())
                .build());
    return primeEntity.getValue();
  }

  public List<PrimeEntity> getLastPrimes() {
    return primeRepository.findTineLastPrime(PageRequest.of(0, 10));
  }
}
