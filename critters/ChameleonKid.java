package critters;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ChameleonKid extends Critter {
	private int courage;

	public ChameleonKid(int c) {
		courage = c;

	}

	public ArrayList<Actor> getActors() {
		ArrayList<Actor> g = getGrid().getNeighbors(getLocation());

		Set<Actor> f = new HashSet<Actor>();
		f.addAll(g);
		ArrayList<Actor> m = new ArrayList<Actor>();

		for (Actor a : g) {
			f.addAll(getGrid().getNeighbors(a.getLocation()));
		}
		m.addAll(f);
		m.remove(this);


		return m;
	}

	public void processActors(ArrayList<Actor> actors) {
		int check = 0;
		for (Actor a : actors) {
			check++;
		}

		if (check < courage) {
			this.setColor(getColor().brighter());

		}

		else {
			this.setColor(getColor().darker());
		}
	}
}
