package marvelInterface.characterDataWrapper;

import lombok.Builder;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Builder
@Entity
public class ComicSummary {
    @Id
    private Long id;
    private String resourceURI;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private ComicList comicList;
}
