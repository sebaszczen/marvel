package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.EventSummary;
import org.springframework.data.repository.CrudRepository;

public interface EventSummaryRepository extends CrudRepository<EventSummary,Long> {
}
