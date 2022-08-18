package com.api.apigestionregion.Controller;
import com.api.apigestionregion.Modele.Exceptionerror;
import com.api.apigestionregion.Modele.Population;
import com.api.apigestionregion.Modele.Region;
import com.api.apigestionregion.Service.PopulationService;
import com.api.apigestionregion.Service.RegionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Api(value = "hello", description = "Sample hello world application")
@RestController
@RequestMapping("/region")
@AllArgsConstructor
public class RegionController {


    private final RegionService regionService;
    @ApiOperation(value = "Just to test the sample test api of My App Service")
   @PostMapping("/creer")
    public Object creer( @RequestBody Region region){
        try {
            return regionService.creer(region);
        }catch (Exception e){
            return Exceptionerror.ErreurResponse("La region "+region.getNomregion()+" existe deja", HttpStatus.OK, null);
        }


    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/read")
    public List<Region>read(){
       return regionService.Lire();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/lire")
    public Iterable<Object[]>getRegionSansP(){
      return regionService.getRegionSansP();
    }
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update/{id}")
    public Region update(@PathVariable Long id, @RequestBody Region region){
       return regionService.modifier(id, region);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
       return regionService.supprimer(id);
    }
    /*@ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/tout")
    public Region nouvelle(@RequestBody Region region, Population population){
        if (population==null){
            populationService.creer(population);
        }

        return regionService.creer(region);
    }*/





}
