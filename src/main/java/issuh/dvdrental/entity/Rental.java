package issuh.dvdrental.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rental")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Rental extends LastUpdateTime {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "rental_id")
  private int rentalId;

  @Column(name = "rental_date")
  private LocalDateTime rentalDate;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "inventory_id")
  Inventory inventory;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "customer_id")
  Customer customer;

  @Column(name = "return_date")
  private LocalDateTime returnDate;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "staff_id")
  Staff staff;
}
