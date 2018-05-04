package marvelInterface.characterDataWrapper;

import jdk.nashorn.internal.objects.Global;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idd;

    private int id;
    @OneToOne(mappedBy = "characters")
    private SeriesList series;
    @OneToOne(mappedBy = "characters")
    private EventList events;
    @OneToOne(mappedBy = "characters")
    private Image thumbnail;

    private String resourceURI;

    @OneToMany(mappedBy = "characters", cascade = CascadeType.ALL)
    private Set<Url> urls;
    @OneToOne(mappedBy = "characters")
    private StoryList stories;
    //    @Column(name="CONTENT", length=512)
    @Column(columnDefinition = "LONGTEXT")
    private String description;

    private String name;

    @ManyToOne
    private CharacterDataContainer characterDataContainer;

    @OneToOne(mappedBy = "characters")
    private ComicList comics;

    private String modified;
}