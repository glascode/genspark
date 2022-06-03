package com.Week_9_Assignment_2.Controller;

import com.Week_9_Assignment_2.Dao.FighterDao;
import com.Week_9_Assignment_2.Entities.Fighter;
import com.Week_9_Assignment_2.Service.FighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Fighter_Controller {

    @Autowired
    private FighterService fighterService;


    @GetMapping("/")
    public String home(){
        return "welcome to the fighter CRUD demonstration app";
    }

    @GetMapping("/fighters")
    public List<Fighter> showMeAllFighters(){
        return this.fighterService.seeAllFighters();
    }


    @GetMapping("/fighters/{name}")
    public Fighter getFighterName(@PathVariable String name){
        return this.fighterService.getFighterByName(name);
    }

    @PostMapping("/fighters")
    public Fighter addFighter(@RequestBody Fighter newFighter){
        return this.fighterService.addFighter(newFighter);
    }


    @PutMapping("/fighters")
    public Fighter updateFighter(@RequestBody Fighter newInformation){
        return this.fighterService.UpdateInformation(newInformation);
    }

    @DeleteMapping("/fighters/{name}")
    public String deleteFighter(@PathVariable String name){
        return this.fighterService.deleteFighter(name);
    }




}
