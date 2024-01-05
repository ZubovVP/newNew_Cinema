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
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.REMOVE, optional = false)
    @JoinColumn(name = "session_id", nullable = false)
    private FilmSession filmSession;

    @Column(name = "row_number", nullable = false)
    private Integer row_number;

    @Column(name = "place_number", nullable = false)
    private Integer place_number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
