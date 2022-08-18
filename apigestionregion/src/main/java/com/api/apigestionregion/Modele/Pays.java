package com.api.apigestionregion.Modele;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Data
@Table(name = "PAYS")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id_Pays;
    //pour définir une taille à la table
    @Column(length = 20, unique = true, nullable = true)
    private String  codePays ;
    @Column( length = 100)
    private  String nom_pays;





}
