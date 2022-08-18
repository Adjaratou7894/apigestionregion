package com.api.apigestionregion.Service;

import com.api.apigestionregion.Modele.Pays;

import java.util.List;

public interface PaysService {

    Pays creer(Pays pays);

    List<Pays> Lire();
    String supprimer(Long id);

    Pays modifier(Long id, Pays pays);
}
