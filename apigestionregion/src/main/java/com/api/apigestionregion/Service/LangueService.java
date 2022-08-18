package com.api.apigestionregion.Service;

import com.api.apigestionregion.Modele.Langue;

import java.util.List;


public interface LangueService {
    Langue creer(Langue langue);
    String supprimer(Long id);

    List<Langue> Lire();

    Langue modifier(Long id, Langue langue);
}
