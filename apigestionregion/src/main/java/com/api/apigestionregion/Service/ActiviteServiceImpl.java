package com.api.apigestionregion.Service;
import com.api.apigestionregion.Modele.Activite;
import com.api.apigestionregion.Repository.ActiviteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ActiviteServiceImpl implements ActiviteService {
    private final ActiviteRepository activiteRepository;
    @Override
    public Activite creer(Activite activite) {
        return activiteRepository.save(activite);
    }

    @Override
    public String supprimer(Long id) {
        activiteRepository.deleteById(id);

        return "Activite supprime avec succès";
    }

    @Override
    public Activite modifier(Long id, Activite activite) {
        return activiteRepository.findById(id)
                .map(a->{
                    a.setNom_activite(activite.getNom_activite());

                    return activiteRepository.save(a);
                }).orElseThrow(() -> new RuntimeException("Désole, Activite non trouvée"));
    }


    @Override
    public List<Activite> Lire() {
        return activiteRepository.findAll();
    }
}
