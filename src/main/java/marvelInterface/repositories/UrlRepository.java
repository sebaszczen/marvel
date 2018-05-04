package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.Url;
import org.springframework.data.repository.CrudRepository;

public interface UrlRepository extends CrudRepository<Url,Long> {
}
