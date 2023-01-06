package recensements.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recensements.model.Personne;
import recensements.repository.PersonneRepository;

import java.sql.Date;

@RestController
@RequestMapping("/Personnes")
public class PersonneController {

    @Autowired
    private PersonneRepository personneRepository;

    @PostMapping
    public Personne createPersonne(Personne personne){
        return personneRepository.save(personne);
    }

    @PostMapping("/createAll")
    public void insertAllPersonne(){
        Personne p1 = new Personne();
        p1.setNom("Mahery");
        p1.setPrenom("Blabla");
        p1.setDatenaissance(new Date(1922,11,03));
        p1.setSexe(1);
        Personne ins = createPersonne(p1);
    }

}
