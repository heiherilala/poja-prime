package com.poja.prime.model.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "\"prime\"")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder(toBuilder = true)
@ToString
@Getter
@Setter
public class PrimeEntity {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private String id;

  @CreationTimestamp
  @Getter(AccessLevel.NONE)
  private Instant creationDatetime;

  String value;
}
