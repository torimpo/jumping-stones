package com.jumpingStones.Exception;

import com.jumpingStones.beans.Movement;

/**
 * 
 * Exception that is thrwon when somebody wants to do an illegal movement.
 *
 */

public class IlegalMoveException extends Exception {
	Movement move;
	
	public IlegalMoveException(){
		move = new Movement();
	}
	
	public IlegalMoveException(Movement move){
		this.move = move;
	}
	
	public String getMessage(){
		return "Can't do movement: " + move;
	}
	
}
