package com.aga.full_backend.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@NoArgsConstructor
public class Customer {

    @SequenceGenerator(name = "customer_id_seq",
    sequenceName = "customer_id_seq",
    allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_seq"
    )
    @Id
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
    private String displayName;
    private String address;
    private String phone;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private int age;

}
