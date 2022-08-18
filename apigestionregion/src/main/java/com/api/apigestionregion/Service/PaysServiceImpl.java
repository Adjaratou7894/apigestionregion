package com.api.apigestionregion.Service;
import com.api.apigestionregion.Modele.Pays;
import com.api.apigestionregion.Repository.PaysRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaysServiceImpl implements PaysService{
    private final PaysRepository paysRepository;
    @Override
    public Pays creer(Pays pays) {
        return paysRepository.save(pays);
    }
    @Override
    public List<Pays> Lire() {
        return paysRepository.findAll();
    }

    @Override
    public String supprimer(Long id) {
        paysRepository.deleteById(id);

        return "Pays supprime avec succès";
    }

    @Override
    public Pays modifier(Long id, Pays pays) {


        return paysRepository.findById(id)
                .map(pays1->{
                    pays1.setCodePays(pays.getCodePays());
                    pays1.setNom_pays(pays.getNom_pays());
                    return paysRepository.save(pays1);
                }).orElseThrow(() -> new RuntimeException("Désole, pays non trouvée"));
    }
}
