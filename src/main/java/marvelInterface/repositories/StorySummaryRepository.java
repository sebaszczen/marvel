package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.StorySummary;
import org.springframework.data.repository.CrudRepository;

public interface StorySummaryRepository extends CrudRepository<StorySummary,Long> {
}
