package issuh.dvdrental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "language")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Language {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "language_id")
  private int languageId;

  @Column(columnDefinition = "bpchar", length = 20) 
  private String name;
}
