package marvelInterface.characterDataWrapper;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
    public class Image
    {
        @Id
        private Long id;
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
