package com.api.apigestionregion.Controller;

import com.api.apigestionregion.Modele.Activite;
import com.api.apigestionregion.Modele.Langue;
import com.api.apigestionregion.Modele.Pays;
import com.api.apigestionregion.Service.ActiviteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "hello", description = "Sample hello world application")
@RequestMapping("/activite")
@RestController
@AllArgsConstructor

public class ActiviteController {
    private final ActiviteService activiteService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/creer")
    public Activite creer(@RequestBody Activite activite){
        return activiteService.creer(activite);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/lire")
    public List<Activite> lire(){
        return activiteService.Lire();
    }
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update/{id}")
    public Activite update(@PathVariable Long id, @RequestBody Activite activite){
        return activiteService.modifier(id, activite);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return activiteService.supprimer(id);
    }
}
