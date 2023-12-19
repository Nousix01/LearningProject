package ma.spring.learningproject.repository;

import ma.spring.learningproject.entity.DealEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "deals")
public interface DealRepository extends CrudRepository<DealEntity, Long> {
    List<DealEntity> findDealEntitiesByDealId(String dealId);
}
