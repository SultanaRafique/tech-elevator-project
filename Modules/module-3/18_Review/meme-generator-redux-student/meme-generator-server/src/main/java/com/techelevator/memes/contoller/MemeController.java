package com.techelevator.memes.contoller;

import com.techelevator.memes.model.CreateMemeInfo;
import com.techelevator.memes.model.Meme;
import com.techelevator.memes.model.MemeListItem;
import com.techelevator.memes.service.MemeGeneratorService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemeController {

    private MemeGeneratorService memeGeneratorService;

    public MemeController(MemeGeneratorService memeGeneratorService) {
        this.memeGeneratorService = memeGeneratorService;
    }

    /*
    * Create a method that will get the list of memes from the MemeGeneratorService
    *
    * It should return a List of MemeListItems objects
    *
    * Use the path /memes
    * */
    @RequestMapping(path = "/memes" , method = RequestMethod.GET)
    public List<MemeListItem> getMemes() { return memeGeneratorService.getMemeList();}

    /*
    * Create a method that will receive a CreateMemeInfo object and use it to call
    * the createMeme method in the MemeGeneratorService
    *
    * It Should return the URL the service returns
    *
    * Use the path /memes
    * */
    @RequestMapping(path ="/memes", method=RequestMethod.POST)
    public String createMeme(@RequestBody CreateMemeInfo memeInfo){
        return memeGeneratorService.createMeme((memeInfo));
    }






}
