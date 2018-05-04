package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.ComicSummary;
import org.springframework.data.repository.CrudRepository;

public interface ComicSummarRepository extends CrudRepository<ComicSummary,Long> {
}
