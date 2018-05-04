package marvelInterface.characterDataWrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StoryList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Characters characters;
    @OneToMany(mappedBy = "storyList", cascade = CascadeType.ALL)
    private Set<StorySummary> items;

    private String collectionURI;

    private String available;

    private String returned;

    public Set<StorySummary> getItems() {
        return items;
    }

    public void setItems(Set<StorySummary> items) {
        this.items = items;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "ClassPojo [items = " + items + ", collectionURI = " + collectionURI + ", available = " + available + ", returned = " + returned + "]";
    }
}
