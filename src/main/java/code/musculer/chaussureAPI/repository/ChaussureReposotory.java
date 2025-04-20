package code.musculer.chaussureAPI.repository;

import code.musculer.chaussureAPI.entite.Chaussure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChaussureReposotory extends JpaRepository<Chaussure,Integer> {
}
