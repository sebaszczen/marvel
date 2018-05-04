package marvelInterface.characterDataWrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ComicList {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @OneToOne
        private Characters characters;
        @OneToMany(mappedBy = "comicList", cascade = CascadeType.ALL)
        private Set<ComicSummary> items =new HashSet<>();
        private String collectionURI;
        private int available;
        private int returned;

}
