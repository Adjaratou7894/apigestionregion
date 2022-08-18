package com.api.apigestionregion.Service;

import com.api.apigestionregion.Modele.Population;
import com.api.apigestionregion.Repository.PopulationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PopulationServiceImpl implements PopulationService {
    @Autowired
    private final PopulationRepository populationRepository;
    @Override
    public Population creer(Population population) {
        return populationRepository.save(population);
    }

    @Override
    public List<Population> Lire() {
        return populationRepository.findAll();
    }

    @Override
    public Population modifier(Long id, Population population) {
        return populationRepository.findById(id)
                .map(p->{
                    p.setNbre_population(population.getNbre_population());
                    p.setAnnee(population.getAnnee());
                    return populationRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Désole, page non trouvée"));
    }

    @Override
    public String supprimer(Long id) {
        populationRepository.deleteById(id);
        return " Population Supprimée !";
    }
}
