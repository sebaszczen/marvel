package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.SeriesSummary;
import org.springframework.data.repository.CrudRepository;

public interface SeriesSummaryRepository extends CrudRepository<SeriesSummary,Long> {
}
