package boxBug;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {

	private int[] list;
	private int steps;
	private int turns;

	public DancingBug(int[] a) {
		list = a;
		steps = 0;
		turns =0;

	}

	public void act() {
		if (canMove()) {

		if (steps %2 == 0){
		
			for (int i = 0; i < list[turns]; i++){
				turn();
			}
			
			
			steps++;
			turns++;
		}
		
		else {
			move();
			steps++;
		}
			
			
		}
		
		

		else {
			turn();
			turn();

		}
	}

}
