package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.SeriesList;
import org.springframework.data.repository.CrudRepository;

public interface SeriesListRepositroy extends CrudRepository<SeriesList,Long> {
}
