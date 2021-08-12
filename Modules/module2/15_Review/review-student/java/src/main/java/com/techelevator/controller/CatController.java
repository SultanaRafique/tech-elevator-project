package com.techelevator.controller;

import com.techelevator.dao.CatCardDao;
import com.techelevator.model.CatCard;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CatController {


    private CatCardDao catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDao catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }

    @RequestMapping(path = "/cards", method = RequestMethod.GET)
    public List<CatCard> cardList(){
        return catCardDao.list();
    }

    @RequestMapping(path = "/cards/{id}", method = RequestMethod.GET)
    public CatCard get(@PathVariable Long id){
      return catCardDao.get(id) ;
    }

    @RequestMapping(path = "/cards/random", method = RequestMethod.GET)
    public CatCard random(){
        CatCard catCard = new CatCard();
        catCard.setImgUrl(catPicService.getPic().getFile());
        catCard.setCaption(catFactService.getFact().getText());
        return catCard;
    }

    @RequestMapping(path = "/cards", method = RequestMethod.POST)
    public boolean save(@RequestBody CatCard card) {
        return catCardDao.save(card);
    }

    @RequestMapping(path = "/cards/{cardId}", method = RequestMethod.PUT)
    public boolean update(@PathVariable long cardId, @RequestBody CatCard changedCard)  {
        return catCardDao.update(cardId, changedCard) ;
    }

    @RequestMapping(path = "/cards/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable long id) {
        return catCardDao.delete(id);
    }
}
