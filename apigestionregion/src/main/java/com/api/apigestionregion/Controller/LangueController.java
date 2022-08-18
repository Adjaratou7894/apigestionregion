package com.api.apigestionregion.Controller;
import com.api.apigestionregion.Modele.Langue;
import com.api.apigestionregion.Modele.Pays;
import com.api.apigestionregion.Service.LangueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "hello", description = "Sample hello world application")
@RestController
@RequestMapping("/langue")
@AllArgsConstructor
public class LangueController {
    private final LangueService langueService;
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/creer")
    public Langue creer(@RequestBody Langue langue){
        return langueService.creer(langue);
    }
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/lire")
    public List<Langue> lire(){
        return langueService.Lire();
    }
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update/{id}")
    public Langue update(@PathVariable Long id, @RequestBody Langue langue){
        return langueService.modifier(id, langue);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return langueService.supprimer(id);
    }
}
