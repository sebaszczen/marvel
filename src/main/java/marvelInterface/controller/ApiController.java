package marvelInterface.controller;

import marvelInterface.characterDataWrapper.CharacterDataWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
@RestController
public class ApiController {


//    @RequestMapping("/mapping")
//    public String result(){
//        RestTemplate restTemplate=new RestTemplate();
//        String url="http://gateway.marvel.com/v1/public/comics?ts=1&apikey=bd506182bc77875426aa883ad82207fc&hash=baccf4f054f42e74abd4c9cede7618f6";
//        CharacterDataWrapper characterDataWrapper=restTemplate.getForObject(url,CharacterDataWrapper.class);
//
//
//
//        return characterDataWrapper.getData().getResults()[10].getDescription();
//    }

}
