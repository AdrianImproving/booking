package com.improving.booking.Models;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Reservation")
@Getter
@Setter

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(time = "time")
    private  LocalDateTime time;

    public Reservation(){

    }
        
    }
}
