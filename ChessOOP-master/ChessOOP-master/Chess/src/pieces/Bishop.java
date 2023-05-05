// This is a Java code for the Bishop class that represents a bishop piece in a chess game. It includes
// a move function that defines the basic rules for movement of Bishop on a chess board. The function
// takes in the current state of the chess board, the x and y coordinates of the Bishop's current
// position, and returns a list of all the possible destinations of a Bishop. The function implements
// the basic principle of Bishop Movement on a chess board, which is to move diagonally in all 4
// directions (NW, NE, SW, SE). The code also includes a constructor for the Bishop class.
/**

This is the Bishop class that represents a bishop piece in a chess game.
@author [jose miguel]
@version [version number 1]
@param state The current state of the chess board.
 * @param x The x-coordinate of the Bishop's current position.
 * @param y The y-coordinate of the Bishop's current position.
 * @return A list of all the possible destinations of a Bishop.
 */

package pieces;

import java.util.ArrayList;

import chess.Cell;
import java.util.Objects;


/**
 * This is the Bishop Class.
 * The Move Function defines the basic rules for movement of Bishop on a chess board
 * 
 *
 */
	
	//Constructor

	
	//move function defined. It returns a list of all the possible destinations of a Bishop
	//The basic principle of Bishop Movement on chess board has been implemented
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		//Bishop can Move diagonally in all 4 direction (NW,NE,SW,SE)
		//This function defines that logic
		possiblemoves.clear();
		int tempx=x+1,tempy=y-1;
		while(tempx<8&&tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
			{
				possiblemoves.add(state[tempx][tempy]);
			}
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy--;
		}
		tempx=x-1;tempy=y+1;
		while(tempx>=0&&tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy++;
		}
		tempx=x-1;tempy=y-1;
		while(tempx>=0&&tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy--;
		}
		tempx=x+1;tempy=y+1;
		while(tempx<8&&tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy++;
		}
		return possiblemoves;
	}