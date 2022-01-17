package sda.clinic.entities;

import javax.persistence.*;

@Entity
@Table(name = "appointments")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;

    private String lastname;
    private String firstname;



}
