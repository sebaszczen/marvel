package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.EventList;
import org.springframework.data.repository.CrudRepository;

public interface EventListRepository extends CrudRepository<EventList,Long> {
}
