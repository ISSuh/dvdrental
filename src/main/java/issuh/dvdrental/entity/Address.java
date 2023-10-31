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
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address extends LastUpdateTime {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "address_id")
  private int addressId;

  private String address;
  private String address2;
  private String district;
  
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "city_id", nullable = false)
  private City city;

  private String postalCode;
  private String phone;

  public Address(LocalDateTime lastUpdate, String address, String address2, String district, City city,
      String postalCode, String phone) {
    super(lastUpdate);
    this.address = address;
    this.address2 = address2;
    this.district = district;
    // this.city = city;
    this.postalCode = postalCode;
    this.phone = phone;
  }
}
