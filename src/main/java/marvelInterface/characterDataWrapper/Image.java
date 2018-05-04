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
    public class Image
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @OneToOne
        private Characters characters;
        private String extension;

        private String path;

        public String getExtension ()
        {
            return extension;
        }

        public void setExtension (String extension)
        {
            this.extension = extension;
        }

        public String getPath ()
        {
            return path;
        }

        public void setPath (String path)
        {
            this.path = path;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [extension = "+extension+", path = "+path+"]";
        }
    }
