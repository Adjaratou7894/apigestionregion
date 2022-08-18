package com.api.apigestionregion.Controller;

import com.api.apigestionregion.Modele.Exceptionerror;
import com.api.apigestionregion.Modele.Pays;
import com.api.apigestionregion.Modele.Region;
import com.api.apigestionregion.Service.PaysService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(value = "hello", description = "Sample hello world application")
@RequestMapping("/pays")
@RestController
@AllArgsConstructor
public class PaysController {
    @Autowired
    private final PaysService paysService;
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/creer")
    public Object creer(@RequestBody Pays pays) {
        try {
            return paysService.creer(pays);
        }catch (Exception e){
            return Exceptionerror.ErreurResponse("Le pays "+pays.getNom_pays()+" existe deja", HttpStatus.OK, null);
        }
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/lire")
    public List<Pays> lire(){
        return paysService.Lire();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update/{id}")
    public Pays update(@PathVariable Long id, @RequestBody Pays pays){
        return paysService.modifier(id, pays);
    }
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return paysService.supprimer(id);
    }
}
