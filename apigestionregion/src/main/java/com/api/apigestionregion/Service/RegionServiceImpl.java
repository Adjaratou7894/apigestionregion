package com.api.apigestionregion.Service;

import com.api.apigestionregion.Modele.Population;
import com.api.apigestionregion.Modele.Region;
import com.api.apigestionregion.Repository.RegionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService{
    private  final RegionRepository regionRepository;
    @Override
    public Region creer(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public List<Region> Lire() {

        return regionRepository.findAll();
    }


    @Override
    public Region modifier(Long id, Region region) {
        return regionRepository.findById(id)
                .map(r->{
                    r.setCoderegion(region.getCoderegion());
                    r.setNomregion(region.getNomregion());
                    r.setSuperficie(region.getSuperficie());
                    return regionRepository.save(r);
                }).orElseThrow(() -> new RuntimeException("Désole, Region non trouvée"));
    }

    @Override
    public String supprimer(Long id) {
        regionRepository.deleteById(id);
        return " Region Supprimée !";
    }

    @Override
    public Iterable<Object[]> getRegionSansP() {
        return regionRepository.getRegionSansP();
    }



}
