package com.api.apigestionregion.Repository;

import com.api.apigestionregion.Modele.Population;
import com.api.apigestionregion.Modele.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface RegionRepository extends JpaRepository<Region,Long> {
    @Query(value = "SELECT coderegion,nomregion,superficie from region, langue, activite,population where region.population_id_population=population.id_population and region.langue_id_langue=langue.id_langue and region.activite_id_activite=activite.id_activite", nativeQuery = true)
    Iterable<Object[]>getRegionSansP();



}
