package marvelInterface.characterDataWrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Character {
    @Id
    private Long id;
//    private String id;

    @OneToOne
    private SeriesList series;

    @OneToOne
    private EventList stories;

    @OneToOne
    private Image thumbnail;

    private String resourceURI;

    private Url[] urls;

    @OneToOne
    private StoryList events;

    private String description;

    private String name;

    @OneToOne
    private ComicList comics;

    private String modified;
}
