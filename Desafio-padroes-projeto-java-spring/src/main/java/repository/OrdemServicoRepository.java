package repository;

import model.OrdemServico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends CrudRepository<OrdemServico, Long> {
}
