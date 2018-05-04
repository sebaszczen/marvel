package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.StoryList;
import org.springframework.data.repository.CrudRepository;

public interface StoryListRepository extends CrudRepository<StoryList,Long> {
}
