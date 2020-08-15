package com.cfmgames.catvsdogtictactoe.Controller;

import com.cfmgames.catvsdogtictactoe.Util.Constants;

public class GameLogic {

    private int difficulty;

    public GameLogic(){
        difficulty = Constants.EASY;
    }

    public GameLogic(int difficulty){
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
