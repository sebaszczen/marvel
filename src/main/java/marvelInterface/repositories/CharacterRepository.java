package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.Characterr;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Characterr, String> {
}
