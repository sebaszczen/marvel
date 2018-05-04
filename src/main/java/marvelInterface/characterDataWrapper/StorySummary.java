package marvelInterface.characterDataWrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StorySummary
    {
        @ManyToOne
        private StoryList storyList;
        @ManyToOne
        private EventList eventList;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @ManyToOne
        private SeriesList seriesList;
        private String resourceURI;

        private String name;

        public String getResourceURI ()
        {
            return resourceURI;
        }

        public void setResourceURI (String resourceURI)
        {
            this.resourceURI = resourceURI;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [resourceURI = "+resourceURI+", name = "+name+"]";
        }
}
