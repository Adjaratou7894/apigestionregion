package com.api.apigestionregion.Service;

import com.api.apigestionregion.Modele.Activite;
import com.api.apigestionregion.Modele.Langue;

import java.util.List;


public interface ActiviteService {
    Activite creer(Activite activite);
    String supprimer(Long id);

    Activite modifier(Long id, Activite activite);

    List<Activite> Lire();
}
