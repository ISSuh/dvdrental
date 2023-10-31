package issuh.dvdrental.entity;

import org.hibernate.annotations.Type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "staff")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Staff extends LastUpdateTime {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "staff_id")
  private int staffId;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "address_id")
  Address address;

  private String email;

  @OneToOne(mappedBy = "manager", fetch = FetchType.LAZY)
  private Store store;

  private boolean active;
  private String username;
  private String password;
  private byte[] picture;
}
