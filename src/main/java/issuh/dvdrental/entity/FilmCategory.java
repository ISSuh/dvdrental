// package issuh.dvdrental.entity;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.OneToOne;
// import jakarta.persistence.Table;
// import lombok.AccessLevel;
// import lombok.Getter;
// import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "film_category")
// @Getter
// @NoArgsConstructor(access = AccessLevel.PROTECTED)
// public class FilmCategory extends LastUpdateTime {

//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   @Column(name = "film_category_id")
//   private int filmCategoryId;

//   @OneToOne(fetch = FetchType.LAZY)
//   @JoinColumn(name = "film_id")
//   Film film;

//   @OneToOne(fetch = FetchType.LAZY)
//   @JoinColumn(name = "category_id")
//   Category category;
// }
