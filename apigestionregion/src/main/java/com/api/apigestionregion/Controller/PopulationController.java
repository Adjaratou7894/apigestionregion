package com.api.apigestionregion.Controller;

import com.api.apigestionregion.Modele.Population;
import com.api.apigestionregion.Modele.Region;
import com.api.apigestionregion.Service.PopulationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(value = "hello", description = "Sample hello world application")
@RestController
@RequestMapping("/population")
@AllArgsConstructor
public class PopulationController {
    @Autowired
    private final PopulationService populationService;
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/creer")
    public Population creer(@RequestBody Population population){
        return populationService.creer(population);

    }
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/lire")
    public List<Population> lire(){
        return populationService.Lire();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update/{id}")
    public Population update(@PathVariable Long id, @RequestBody Population population){
        return populationService.modifier(id, population);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return populationService.supprimer(id);
    }



   /* @PostMapping("/regions/{regionId}/populations")
    public ResponseEntity<Population> addTag(@PathVariable(value = "regionId") Long tutorialId, @RequestBody Population tagRequest) {
        SimpleJpaRepository<Object, Object> regionService = null;
        Object poppulationId = null;
        String regionID;
        Population population = regionService.findById(poppulationId).map(tutorial -> {
            Thread populationRequest = new Thread();
            long populationId = populationRequest.getId();

            // tag is existed
            if (populationId != 0L) {
                String PopulationId = null;
                Population _population = populationService.findById(populationId)
                        .orElseThrow(() -> new ResourceNotFoundException("Not found Tag with id = " + PopulationId));
                Region.addPopulation(_population);
                Object region;
                regionService.save(region);
                return _population;
            }

            // add and create new Tag
            Region.addPopulation(populationRequest);
            return populationService.save(populationRequest);
        }).orElseThrow(() -> new ResourceNotFoundException("Not found region with id = " + regionID));
        return new ResponseEntity<>(population, HttpStatus.CREATED);
    }*/
}
