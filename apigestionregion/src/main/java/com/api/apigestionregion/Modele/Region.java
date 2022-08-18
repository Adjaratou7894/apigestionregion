package com.api.apigestionregion.Modele;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "REGION")
@Getter
@Setter
@NoArgsConstructor

public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //la clé primary de la table de region
    private Long id_region;
    //les differents attributs  de la table region avec la taille de caractère
    @Column (length = 20, unique = true, nullable = true)
    private String coderegion;
    @Column(length = 100, unique = true, nullable = true)
    private String nomregion;
    @Column(length = 100, unique = true, nullable = true)
    private String superficie;
    //la clé etrangère de pays
    @ManyToOne
    @JoinColumn(name ="pays_id_pays")
    private Pays pays;
    //la clé etrangère d'activite
    @ManyToOne
    @JoinColumn(name = "activite_id_activite")
    private Activite activite;

    @ManyToOne
    @JoinColumn(name = "langue_id_langue")
    private  Langue langue;



   /* @OneToMany(mappedBy = "region")
    Set<RegionPop> registrations;

    @ManyToMany
    Set<Population> likedCourses;

    @ManyToMany
    @JoinTable(
            name = "course_like",
            joinColumns = @JoinColumn(name = "id_region"),
            inverseJoinColumns = @JoinColumn(name = "id_population"))
    Set<Population> likedCourse;*/



   /* @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "Region_Pop",
            joinColumns = { @JoinColumn(name = "region_id_region") },
            inverseJoinColumns = { @JoinColumn(name = "population_id_population") })
    private Set<Population> populations= new HashSet<>();

    public Region(Long id_region, String coderegion, String superficie, String nomregion) {

    }*/


}

