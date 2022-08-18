package com.api.apigestionregion.Service;

import com.api.apigestionregion.Modele.Langue;

import com.api.apigestionregion.Repository.LangueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor

public class LangueServiceImpl implements LangueService {
    private final LangueRepository langueRepository;
    @Override
    public Langue creer(Langue langue) {
        return langueRepository.save(langue);
    }

    @Override
    public String supprimer(Long id) {
        langueRepository.deleteById(id);

        return "langue supprime avec succès";
    }

    @Override
    public List<Langue> Lire() {
        return langueRepository.findAll();
    }

    @Override
    public Langue modifier(Long id, Langue langue) {
        return langueRepository.findById(id)
                .map(l->{
                    l.setLibelle(langue.getLibelle());

                    return langueRepository.save(l);
                }).orElseThrow(() -> new RuntimeException("Désole, Langue non trouvée"));
    }
}
