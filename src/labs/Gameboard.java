package labs;

import java.util.Arrays;

public class Gameboard {

	
    String [] gameBoard = new String [9];

	 public void initialize() {
		
		for ( int i = 1; i <= 9 ; i ++) {
			this.gameBoard[i-1 ] = String.valueOf(i);
			
		}
		
}
	public void display() {
		
		System.out.println("    +-----+-----+");
		System.out.println("    | " + this.gameBoard[0] + " | " + this.gameBoard[1] + " | "  + this.gameBoard[2]  + " |");
		System.out.println("    +-----+-----+");
		System.out.println("    | " + this.gameBoard[3] + " | " + this.gameBoard[4] + " | "  + this.gameBoard[5]  + " |");
		System.out.println("    +-----+-----+");
		System.out.println("    | " + this.gameBoard[6] + " | " + this.gameBoard[7] + " | "  + this.gameBoard[8]  + " |");
		System.out.println("    +-----+-----+");
		
	}

	
	public boolean ifValidSetSquare(int squareNumber, String readInput, String player) {
		if(this.gameBoard[squareNumber-1].equals(readInput)) {
			this.gameBoard[squareNumber-1] = player;
			return true;
		}else{
		
		return false;
	}
		
		
}
	public String checkWinStatus() {
		for(int pos = 0; pos < 8 ; pos++) {
			String winningCombo = "";
			switch (pos) {
			case 0: 
				winningCombo = this.gameBoard[0] + this.gameBoard[1] + this.gameBoard[2];
			break;
			case 1: 
				winningCombo = this.gameBoard[3] + this.gameBoard[4] + this.gameBoard[5];
				break;
			case 2: 
				winningCombo = this.gameBoard[6] + this.gameBoard[7] + this.gameBoard[8];
				break;
			case 3: 
				winningCombo = this.gameBoard[0] + this.gameBoard[3] + this.gameBoard[6];
				break;
			case 4: 
				winningCombo = this.gameBoard[1] + this.gameBoard[4] + this.gameBoard[7];
				break;
				
			case 5: 
				winningCombo = this.gameBoard[2] + this.gameBoard[5] + this.gameBoard[8];
				break;
			case 6: 
				winningCombo = this.gameBoard[0] + this.gameBoard[4] + this.gameBoard[8];
				break;
			case 7: 
				winningCombo = this.gameBoard[2] + this.gameBoard[4] + this.gameBoard[6];
				break;
			}
		
		
		
	
	if( winningCombo.equals("XXX")) {
		 return "X";
	 } else if (winningCombo.equals("000")) {
		 return "0";
	 }
		}
	
	
	 
	 for(int pos = 1 ; pos <= 9; pos ++) {
		 if( Arrays.asList(this.gameBoard).contains(String.valueOf(pos))) {
			 break;
		 }else if ( pos == 9 ) {
			 return "draw";
			 
		 }
	 
	 
	 
	
	 
	}
	 
	 return "";
	 

		}
}









	

	
	
	
