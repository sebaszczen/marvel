package marvelInterface;

import marvelInterface.characterDataWrapper.CharacterDataContainer;
import marvelInterface.characterDataWrapper.CharacterDataWrapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
//        CharacterDataWrapper characterDataWrapper=CharacterDataWrapper.builder().attributionHTML("attributionHTML").
//                attributionText("attributionText").etag("etag").status("status").data(new CharacterDataContainer()).
//                copyright("copyright").code("code").build();
//
////        System.out.println(characterDataWrapper.getData().getResults()[1].getDescription());
//        System.out.println(characterDataWrapper.getAttributionText());

//        RestTemplate restTemplate=new RestTemplate();
//        String url="http://gateway.marvel.com/v1/public/comics?ts=1&apikey=bd506182bc77875426aa883ad82207fc&hash=baccf4f054f42e74abd4c9cede7618f6";
//        CharacterDataWrapper characterDataWrapper=restTemplate.getForObject(url,CharacterDataWrapper.class);

    }
}
