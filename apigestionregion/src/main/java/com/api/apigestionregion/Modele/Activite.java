package com.api.apigestionregion.Modele;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ACTIVITE")
@NoArgsConstructor
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_activite;
    @Column (length = 50, unique = true, nullable = true)
    private String nom_activite;


}
