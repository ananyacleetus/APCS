package boxBug;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {

	private int steps;
	private int sideLength;
	private int startx;


	public ZBug(int length) {
		steps = 0;
		sideLength = length;
		setDirection(90);
		startx= 0;

	}

	public void act() {
		
		if (steps ==0){
			startx= this.getLocation().getCol();
		}
		
		if (steps < (3 * sideLength)) {
			move();
			steps++;

			if (steps == sideLength || !canMove()) {
				setDirection(225);
			}
				if (startx == this.getLocation().getCol()){
					setDirection(90);
					
				}
			}

		}

	}

