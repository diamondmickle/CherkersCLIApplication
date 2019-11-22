package com;

public class Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Checker checkerGame = new Checker() ;
		
		checkerGame.setupBuyer();
		
		
		while(checkerGame.isInProgress())	{
			
			checkerGame.currentPlayerTakeTurn();
			checkerGame.displayBoard();
			
		}
		
		checkerGame.displayEndOfGameMessage();
		
	
		
		
}
public void setupBuyer() {} 
public boolean isInProgress() {
	return false;
}

public void currentPlayerTakeTurn() {}
public void displayBoard() {} 
public void displayEndOfGameMessage () {} 



}
