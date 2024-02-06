package ma.spring.learningproject.repository;

import ma.spring.learningproject.entity.DealEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DealRepository extends JpaRepository<DealEntity, Long> {
    List<DealEntity> findDealEntitiesByDealId(Long dealId);
}
