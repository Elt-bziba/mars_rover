package rover;

public class Position {
	public int pos_x;
	public int pos_y;
	public int width = 100;
	public int height = 100;
	
	
	
	public Position(int pos_x, int pos_y) {
		this.pos_x = pos_x;
		this.pos_y = pos_y;
	}
	
	public void starting_point() {
		this.pos_x = 0;
		this.pos_y = 0;
	}

	public int getPos_x() {
		return pos_x;
	}

	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}

	public int getPos_y() {
		return pos_y;
	}

	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	
	
}
