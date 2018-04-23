package marvelInterface.characterDataWrapper;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Builder
@Entity
public class EventList {
        @Id
        private Long id;
        private StorySummary[] items;

        private String collectionURI;

        private String available;

        private String returned;
}
