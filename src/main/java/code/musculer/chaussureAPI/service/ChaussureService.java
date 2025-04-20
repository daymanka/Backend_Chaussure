package code.musculer.chaussureAPI.service;

import code.musculer.chaussureAPI.entite.Chaussure;
import code.musculer.chaussureAPI.repository.ChaussureReposotory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChaussureService {
    private ChaussureReposotory chaussureReposotory;

    public ChaussureService(ChaussureReposotory chaussureReposotory) {
        this.chaussureReposotory = chaussureReposotory;
    }

    public List<Chaussure> rechercher() {
        try {
            return this.chaussureReposotory.findAll();
        }
        catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void creer(Chaussure chaussure) {
        this.chaussureReposotory.save(chaussure);
    }

    public Chaussure lire(int id){
        Optional<Chaussure> chaussureOptional = this.chaussureReposotory.findById(id);
        return chaussureOptional.orElse(null);
    }

    public void delete(int id) {
        this.chaussureReposotory.deleteById(id);
    }

    public void modifier(int id, Chaussure chaussure) {
        Chaussure chaussureInDb = lire(id);
        if(chaussure.getId() == chaussureInDb.getId()){
            chaussureInDb.setCouleur(chaussure.getCouleur());
            chaussureInDb.setMarque(chaussure.getMarque());
            chaussureInDb.setPrix(chaussure.getPrix());
            chaussureInDb.setTaille(chaussure.getTaille());
        }
        this.chaussureReposotory.save(chaussureInDb);
    }
}
