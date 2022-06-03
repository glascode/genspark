package com.Week_9_Assignment_2.Service;

import com.Week_9_Assignment_2.Entities.Fighter;

import java.util.List;

public interface FighterService {

    List<Fighter>seeAllFighters();

    Fighter getFighterByName(String name);

    Fighter addFighter(Fighter fighter);

    Fighter UpdateInformation(Fighter fighter);

    String deleteFighter(String fighter_name);





}
