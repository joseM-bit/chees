/**
 * The Rook class is a subclass of the Piece class and defines the movement of a rook in a game of
 * chess.
 */
package pieces;

import java.util.ArrayList;

import chess.Cell;
/**

This is the rook class that represents a rook piece in a chess game.
@author [jose miguel]
@version [version number 1]
@param state The current state of the chess board.
 * @param x The x-coordinate of the rook's current position.
 * @param y The y-coordinate of the rook's current position.
 * @return A list of all the possible destinations of a rook.
 */

/**
 * This is the Rook class inherited from abstract Piece class
 *
 */
public class Rook extends Piece{
	
	//Constructor
	public Rook(String i,String p,int c)
	{
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	//Move function defined
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		//Rook can move only horizontally or vertically
		possiblemoves.clear();
		int tempx=x-1;
		while(tempx>=0)
		{
			if(state[tempx][y].getpiece()==null)
				possiblemoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx--;
		}
		tempx=x+1;
		while(tempx<8)
		{
			if(state[tempx][y].getpiece()==null)
				possiblemoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx++;
		}
		int tempy=y-1;
		while(tempy>=0)
		{
			if(state[x][tempy].getpiece()==null)
				possiblemoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy--;
		}
		tempy=y+1;
		while(tempy<8)
		{
			if(state[x][tempy].getpiece()==null)
				possiblemoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy++;
		}
		return possiblemoves;
	}
}
