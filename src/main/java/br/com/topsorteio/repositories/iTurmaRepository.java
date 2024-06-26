package br.com.topsorteio.repositories;

import br.com.topsorteio.entities.TurmaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface iTurmaRepository extends JpaRepository<TurmaModel, Integer> {
    Optional<TurmaModel> findByNome(String nome);
}
