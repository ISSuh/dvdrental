package issuh.dvdrental.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class LastUpdateTime {

  @Column(name = "last_update")
  private LocalDateTime lastUpdate;

  public LastUpdateTime(LocalDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}
