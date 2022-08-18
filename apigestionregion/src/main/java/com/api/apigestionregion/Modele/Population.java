package com.api.apigestionregion.Modele;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Year;


@Entity
@Data
@Table(name = "POPULATION")
@Getter
@Setter
@NoArgsConstructor

public class Population {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_population;
    @Column(length = 150, unique = true, nullable = true)
    private String nbre_population;

    private Long annee;
    @ManyToOne
    @JoinColumn(name = "region_id_region")
    private Region region;


    /* @OneToMany(mappedBy = "population")
    Set<RegionPop> registrations;
    @ManyToMany
    Set<Region> affecter;
    @ManyToMany(mappedBy = "likedCourses")
    Set<Region> affectation;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "populations")
    @JsonIgnore
    private Set<Region> regions = new HashSet<>();*/


}
