package marvelInterface.characterDataWrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EventList {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @OneToOne
        private Characterr characterr;
        @OneToMany(mappedBy = "eventList", cascade = CascadeType.ALL)
        private Set<StorySummary> items;

        private String collectionURI;

        private String available;

        private String returned;
}
