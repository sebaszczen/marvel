package marvelInterface.characterDataWrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
    public class CharacterDataContainer
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String total;

        private String limit;

//        @OneToMany(mappedBy = "characterDataContainer",cascade = CascadeType.ALL)
//        private Set<Characters> results;

        private String count;

        private String offset;

        @OneToOne
        private CharacterDataWrapper characterDataWrapper;
    }
