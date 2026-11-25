package rover;

import java.util.Arrays;

public class Rover {
	public Position position;
	public Direction direction;
	public char car;
	
	public void rotate(char car) {
		switch(car) {
			case 'r':
				this.direction = this.direction.right();
				break;
			case 'l':
				this.direction = this.direction.left();
				break;
		}  
	}
	
	public void move(char car) {
		switch(car) {
		  	case 'f':
		  		forward();
		  		break;
		  	case 'b':
		  		backward();
		  		break;
		}
	}

	public Boolean obstacleDetection(Position position, Direction direction) {
		//TODO
		return true;
	}
	
	public void report() {
		System.out.println("Obstacle detected");
	}
	
	public void forward() {
		if (this.direction == Direction.NORTH) {
			this.position.setPos_y(this.position.getPos_y()+1);
		}
		else if (this.direction == Direction.SOUTH) {
			this.position.setPos_y(this.position.getPos_y()-1);
		}
		else if (this.direction == Direction.WEST) {
			this.position.setPos_x(this.position.getPos_x()-1);
		}
		else if (this.direction == Direction.EAST) {
			this.position.setPos_x(this.position.getPos_x()+1);
		}
	}
	
	public void backward() {
		if (this.direction == Direction.NORTH) {
			this.position.setPos_y(this.position.getPos_y()-1);
		}
		else if (this.direction == Direction.SOUTH) {
			this.position.setPos_y(this.position.getPos_y()+1);
		}
		else if (this.direction == Direction.WEST) {
			this.position.setPos_x(this.position.getPos_x()+1);
		}
		else if (this.direction == Direction.EAST) {
			this.position.setPos_x(this.position.getPos_x()-1);
		}
	}
	
	public void input(char car) {
		if (Arrays.asList('f', 'b').contains(car)) {
			move(car);
		}
		
		if (Arrays.asList('r', 'l').contains(car)) {
			rotate(car);
		}
	}


}
