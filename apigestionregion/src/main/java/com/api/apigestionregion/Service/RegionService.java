package com.api.apigestionregion.Service;

import com.api.apigestionregion.Modele.Population;
import com.api.apigestionregion.Modele.Region;

import java.util.List;
import java.util.Optional;

public interface RegionService {


    Region creer(Region region);
    List<Region> Lire();
    Region modifier(Long id , Region region);
    String supprimer(Long id);
    Iterable<Object[]>getRegionSansP();




}
