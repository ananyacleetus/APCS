package boxBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner {

	private static int[] turns;

	public static void main(String[] args) {
		turns = new int[((int) Math.random() * 5)];

		for (int i = 0; i < turns.length; i++) {

			turns[i] = (int) (Math.random() * 360);

		}

		ActorWorld world = new ActorWorld();
		DancingBug james = new DancingBug(turns);
		world.add(james);

		world.show();
	} 
}