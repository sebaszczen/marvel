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

        @OneToMany(mappedBy = "characterDataContainer",cascade = CascadeType.ALL)
        private List<Characterr> results;

        private String count;

        private String offset;

        @OneToOne
        private CharacterDataWrapper characterDataWrapper;

        public String getTotal ()
        {
            return total;
        }

        public void setTotal (String total)
        {
            this.total = total;
        }

        public String getLimit ()
        {
            return limit;
        }

        public void setLimit (String limit)
        {
            this.limit = limit;
        }

        public List<Characterr> getResults ()
        {
            return results;
        }

        public void setResults (List<Characterr> results)
        {
            this.results = results;
        }

        public String getCount ()
        {
            return count;
        }

        public void setCount (String count)
        {
            this.count = count;
        }

        public String getOffset ()
        {
            return offset;
        }

        public void setOffset (String offset)
        {
            this.offset = offset;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [total = "+total+", limit = "+limit+", results = "+results+", count = "+count+", offset = "+offset+"]";
        }
    }
