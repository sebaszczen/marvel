package marvelInterface.repositories;

import marvelInterface.characterDataWrapper.Characters;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Characters, String> {
}
