package critters;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class KingCrab extends Critter {
	private int courage;

	public KingCrab(int c) {
		courage = c;

	}

	public ArrayList<Actor> getActors() {

		return getGrid().getNeighbors(getLocation());
	}

	public void processActors(ArrayList<Actor> actors) {

		for (Actor a : actors) {
			a.setDirection(a.getLocation().getDirectionToward(this.getLocation())+180);
			
			
		}
	}

}