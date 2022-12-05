package uz.anvar.kif.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("users"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = ("name"))
    private String name;

    @Column(name = ("Familya"))
    private String surname;

    @Column(name = ("Yo'nalishi"))
    private String direction;

    @Column(name = ("Staji"))
    private String seniority;


}
