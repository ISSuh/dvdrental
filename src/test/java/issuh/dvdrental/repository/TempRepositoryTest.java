package issuh.dvdrental.repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import issuh.dvdrental.entity.Address;
import issuh.dvdrental.entity.Staff;
import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
public class TempRepositoryTest {
  @Autowired
  public TempRepository tempRepository;

  @Test
  void findAddress() {
    List<Address> findAll = tempRepository.findAddress();

    Assertions.assertThat(findAll.size()).isNotEqualTo(0);
  }

  @Test
  void findStaff() {
    List<Staff> findAll = tempRepository.findStaff();

    Assertions.assertThat(findAll.size()).isNotEqualTo(0);
  }
}
