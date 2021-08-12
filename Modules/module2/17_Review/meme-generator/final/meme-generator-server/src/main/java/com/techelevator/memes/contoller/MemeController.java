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

    @RequestMapping(path = "/memes", method = RequestMethod.GET)
    public List<MemeListItem> getMemeList() {
        return memeGeneratorService.getMemeList();
    }

    @RequestMapping(path = "/memes", method = RequestMethod.POST)
    public String createMeme(@RequestBody CreateMemeInfo info) {
        return this.memeGeneratorService.createMeme(info);
    }

}
