package code.musculer.chaussureAPI.controller;

import code.musculer.chaussureAPI.entite.Chaussure;
import code.musculer.chaussureAPI.service.ChaussureService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/chaussure", produces = APPLICATION_JSON_VALUE)
public class ChaussureController {

    private ChaussureService chaussureService;

    public ChaussureController(ChaussureService chaussureService) {
        this.chaussureService = chaussureService;
    }

    @GetMapping
    public List<Chaussure> rechercher(){
        return this.chaussureService.rechercher();
    }

    @GetMapping(path = "{id}")
    public Chaussure lire(@PathVariable int id){
        return this.chaussureService.lire(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void creer(@RequestBody Chaussure chaussure){
        this.chaussureService.creer(chaussure);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable int id){
        this.chaussureService.delete(id);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping(path = "{id}")
    public void modiffier(@PathVariable int id, @RequestBody Chaussure chaussure){
        this.chaussureService.modifier(id,chaussure);
    }
}
