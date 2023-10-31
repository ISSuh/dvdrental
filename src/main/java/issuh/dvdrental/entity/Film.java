package issuh.dvdrental.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "film")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Film extends LastUpdateTime {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "film_id")
  private int filmId;

  private String title;

  private String description;

  @Column(name = "release_year", columnDefinition = "year")
  private int releaseYear;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "language_id")
  Language language;

  @Column(name = "rental_duration")
  private short rentalDuration;

  @Column(name = "rental_rate")
  private BigDecimal rentalRate;

  private short length;

  @Column(name = "replacement_cost")  
  private BigDecimal replacementCost;
}
