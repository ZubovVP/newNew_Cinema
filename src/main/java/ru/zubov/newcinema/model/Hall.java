package ru.zubov.newcinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "halls")
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "row_count", nullable = false)
    private Integer row_count;

    @Column(name = "place_count", nullable = false)
    private Integer place_count;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;
}
