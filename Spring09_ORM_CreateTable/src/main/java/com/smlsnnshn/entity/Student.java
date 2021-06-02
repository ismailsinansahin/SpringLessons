package com.smlsnnshn.entity;

import com.smlsnnshn.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "studentFirstName")
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    @Column(name = "studentEmailAddress")
    private String email;

//We changed the data.sql name to see the result of the @Column
//Because we didn't want to change the sql code

    @Transient
    private String city;

    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Temporal(TemporalType.TIME)
    private Date birthTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;

    @Column(columnDefinition = "DATE")
    private LocalDate localDate;
    @Column(columnDefinition = "TIME")
    private LocalTime localTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;


}
