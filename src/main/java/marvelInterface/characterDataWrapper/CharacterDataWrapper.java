package marvelInterface.characterDataWrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CharacterDataWrapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String attributionText;

        private String etag;

        private String status;

        @OneToOne(cascade = CascadeType.ALL)
        private CharacterDataContainer data;
//
        private String copyright;

        private String code;

        private String attributionHTML;


    }

