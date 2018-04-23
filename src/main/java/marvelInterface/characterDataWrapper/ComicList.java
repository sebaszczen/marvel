package marvelInterface.characterDataWrapper;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@Entity
public class ComicList {
        @Id
        private Long id;
        @OneToMany(mappedBy = "comicList", cascade = CascadeType.ALL)
        @OrderColumn
        private ComicSummary[] items;
        private String collectionURI;
        private int available;
        private int returned;

        private Character character;

}
