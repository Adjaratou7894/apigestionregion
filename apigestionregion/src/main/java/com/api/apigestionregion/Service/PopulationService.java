package com.api.apigestionregion.Service;

import com.api.apigestionregion.Modele.Population;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PopulationService {

    Population creer(Population population);
    List<Population> Lire();
    Population modifier(Long id , Population population);
    String supprimer(Long id);



}
