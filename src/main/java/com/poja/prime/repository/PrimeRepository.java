package com.poja.prime.repository;

import com.poja.prime.PojaGenerated;
import com.poja.prime.model.entity.PrimeEntity;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface PrimeRepository extends JpaRepository<PrimeEntity, String> {
  @Query("select p from PrimeEntity p order by p.creationDatetime desc")
  List<PrimeEntity> findTineLastPrime(Pageable pageable);
}
