package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.ComicList;
import org.springframework.data.repository.CrudRepository;

public interface ComicListRepositories extends CrudRepository<ComicList,Long> {
}
