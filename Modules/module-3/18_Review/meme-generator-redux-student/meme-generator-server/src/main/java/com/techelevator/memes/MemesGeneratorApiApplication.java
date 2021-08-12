package com.techelevator.memes;

import com.techelevator.memes.service.MemeGeneratorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemesGeneratorApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemesGeneratorApiApplication.class, args);

        MemeGeneratorService service = new MemeGeneratorService();

        /*
        CaptionedMeme meme = new CaptionedMeme();
        meme.setTemplateId("112126428");
        meme.setUsername("philayoav");
        meme.setPassword("6R6jEhGRPtepcr");
        meme.setTopText("How YOU doin'?");

        String result = service.createMeme(meme);

        System.out.println(result);

        Meme[] data = service.getMemes();

        System.out.println(data.length);
        */
    }

}
