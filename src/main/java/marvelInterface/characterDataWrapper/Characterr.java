package marvelInterface.characterDataWrapper;

import jdk.nashorn.internal.objects.Global;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Characterr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @OneToOne(mappedBy ="characterr")
    private SeriesList series;
    @OneToOne(mappedBy ="characterr")
    private EventList stories;
    @OneToOne(mappedBy ="characterr")
    private Image thumbnail;

    private String resourceURI;

    @OneToMany(mappedBy = "characterr", cascade = CascadeType.ALL)
    private Set<Url> urls;
    @OneToOne(mappedBy ="characterr")
    private StoryList events;

    private String description;

    private String name;

    @ManyToOne
    private CharacterDataContainer characterDataContainer;

    @OneToOne(mappedBy ="characterr")
    private ComicList comics;

    private String modified;
}
