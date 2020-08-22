package com.cfmgames.catvsdogtictactoe.Controller;

public class Board {

    public int[][] board = new int[3][3];

    /**
     * This constructor creates a completely blank
     * Tic-Tac-Toe board
     */
    public Board(){
        //Create a new board with all blank spaces
        for(int x = 0; x <= 2; x++){
            for(int y = 0; y <= 2; y++){
                board[x][y] = 0;
            }

        }

    }

    /**
     * This board constructor, used during MinMax operations,
     * will allow for easy copying of the currently existing
     * game board
     * @param brd The board to be copied
     */
    public Board(Board brd){
        this.board = brd.board;
    }

    /**
     * Places a player token onto the board
     * @param x x coordinate
     * @param y y coordinate
     * @param player number of the player to place the token (1 or 2)
     */
    public void placeToken(int x, int y, int player){
        board[x][y] = player;
    }

    /**
     * Return the token occupying this space as a String
     * @param x x coordinate
     * @param y y coordinate
     * @return The player number as a string
     */
    public String getToken(int x, int y){
        return String.valueOf(board[x][y]);
    }

    /**
     * Clear the game board completely
     */
    public void clearBoard(){
        for(int x = 0; x <= 2; x++){
            for(int y = 0; y <= 2; y++){
                board[x][y] = 0;
            }
        }
    }
}
