package day3;
/**
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid. The rules of Tic-Tac-Toe are:

    Players take turns placing characters into empty squares ' '.
    The first player A always places 'X' characters, while the second player B always places 'O' characters.
    'X' and 'O' characters are always placed into empty squares, never on filled ones.
    The game ends when there are three of the same (non-empty) character filling any row, column, or diagonal.
    The game also ends if all squares are non-empty.
    No more moves can be played if the game is over.

Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that the ith move will be played on grid[rowi][coli]. return the winner of the game if it exists (A or B). In case the game ends in a draw return "Draw". If there are still movements to play return "Pending".

You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe), the grid is initially empty, and A will play first.
 * 
 * 
 * 
 * 
 */
import java.util.*;
public class WinnerOfTicTacToe {

    public static String tictactoe(int[][] moves)
    {
    	LinkedList<String> list= new LinkedList<String>();
    	int i;
    	//the person who completes the game for that we will check
    	//if moves.length is odd means A completed game, so check condition for A
    	//if moves.length is even means B completed game, so check condition for B
    	if(moves.length%2==0)
    		i=1;
    	else
    		i=0 ;
    	
    	//add moves into list
    	for( ; i<moves.length ; i=i+2)
    	{
    		list.add(moves[i][0]+""+moves[i][1]);
    	}
    	
    	//check all combinations into list for winning
    	if((list.contains("00")&&list.contains("11")&&list.contains("22"))
    	||(list.contains("02")&&list.contains("11")&&list.contains("20"))
    	||(list.contains("00")&&list.contains("01")&&list.contains("02"))
    	||(list.contains("10")&&list.contains("11")&&list.contains("12"))
    	||(list.contains("20")&&list.contains("21")&&list.contains("22"))
    	||(list.contains("00")&&list.contains("01")&&list.contains("02"))
    	||(list.contains("01")&&list.contains("11")&&list.contains("21"))
    	||(list.contains("02")&&list.contains("12")&&list.contains("22"))
    	)
    	{
    		if(moves.length%2==0)
    			return "B";
    		else return "A";
    	}
    	
    	return moves.length==9?"draw":"pending";
    }

    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/**
		 * 
		 * Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
Output: "A"
Explanation: A wins, they always play first.
		 */
		
		/*
		 * Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
Output: "B"
Explanation: B wins.
		 * 
		 * 
		 */
		System.out.println("How many moves? ");
		int n= sc.nextInt();
		int[][]moves= new int[n][2];
		System.out.println("Enter the moves matrix: ");
		for(int i=0 ; i<n ; i++)
		{
			moves[i][0]=sc.nextInt();
			moves[i][1]=sc.nextInt();
		}
		
		String win=tictactoe(moves);
		System.out.println(win);

	}

}
