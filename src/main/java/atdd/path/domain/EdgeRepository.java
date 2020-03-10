package atdd.path.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EdgeRepository extends JpaRepository<Edge, Long> {
    @Query(value = "SELECT * FROM edge WHERE line_id=? ORDER BY source_id DESC", nativeQuery = true)
    List<Edge> findByLineId(Long id);
}