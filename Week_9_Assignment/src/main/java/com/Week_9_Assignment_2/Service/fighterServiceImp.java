package com.Week_9_Assignment_2.Service;

import com.Week_9_Assignment_2.Dao.FighterDao;
import com.Week_9_Assignment_2.Entities.Fighter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class fighterServiceImp implements FighterService {

    @Autowired
    private FighterDao fighterDao;

    @Override
    public List<Fighter> seeAllFighters() {
        return  this.fighterDao.findAll();

    }

    @Override
    public Fighter getFighterByName(String name) {
        Optional<Fighter> f = this.fighterDao.findById(name);
        Fighter fighter = null;
        if (f.isPresent()){
            fighter = f.get();
        }else{throw new RuntimeException("no fighter by that name ::" + name);
        }
        return fighter;
    }

    @Override
    public Fighter UpdateInformation(Fighter fighter) {
        return fighterDao.save(fighter);
    }

    @Override
    public String deleteFighter(String fighter) {
         fighterDao.deleteById(fighter);

         return "Fighter removed from the roster";
    }

    @Override
    public Fighter addFighter(Fighter fighter) {
        return fighterDao.save(fighter);
    }
}
