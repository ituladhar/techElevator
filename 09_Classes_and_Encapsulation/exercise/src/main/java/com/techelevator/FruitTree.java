package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    // Constructor
    public FruitTree (String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    //getter
    public String getTypeOfFruit(){
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft(){
        return piecesOfFruitLeft;
    }


    public boolean pickFruit ( int numberOfPiecesToRemove ){
        if(numberOfPiecesToRemove > piecesOfFruitLeft) return false;

             if (numberOfPiecesToRemove > this.piecesOfFruitLeft) return false;
              else {
                  piecesOfFruitLeft -=numberOfPiecesToRemove;
                  return true;}
    }
}
