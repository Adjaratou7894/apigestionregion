package com.api.apigestionregion.Modele;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Table(name = "LANGUE")
@Getter
@Setter
@NoArgsConstructor
public class Langue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_langue;
    @Column (length = 50, unique = true, nullable = true)
    private String libelle;


}
