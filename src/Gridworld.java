import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import info.gridworld.world.*;

public class Gridworld {

public static void main(String[] args) {
int 	randomx = new Random().nextInt(10);
int randomy = new Random().nextInt(10);
	World w = new World();
	Bug b = new Bug();
	Bug bb = new Bug();
	w.show();
	for(int i=0;i<10;i++) {
		for(int c=0;c<10;c++) {
			Flower f = new Flower();
			Location ll = new Location(i, c);
			w.add(ll, f);
			if(i<4 && c<5) {
				f.setColor(Color.BLUE);
			}
			else if(i%2==0) {
				f.setColor(Color.RED);
			}
			else {
				f.setColor(Color.WHITE);
			}
		}
	}
	Location l = new Location(1, 1);
	Location lll = new Location(randomx, randomy);
	w.add(l, b);
	w.add(lll, bb);
	bb.setColor(Color.BLUE);
	bb.setDirection(90);

}
}
