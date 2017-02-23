
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creating a city
        City kw = new City();
        
        // creating a robot
        RobotSE jerrycan = new RobotSE(kw, 4, 0, Direction.EAST);
        
        // creating a staircase
         new Wall(kw, 4, 2, Direction.WEST);
         new Wall(kw, 4, 2, Direction.NORTH);
         new Wall(kw, 3, 3, Direction.WEST);
         new Wall(kw, 3, 3, Direction.NORTH);
         new Wall(kw, 2, 4, Direction.WEST);
         new Wall(kw, 2, 4, Direction.NORTH);
         new Wall(kw, 2, 5, Direction.NORTH);
         new Wall(kw, 2, 5, Direction.EAST);
         new Wall(kw, 3, 6, Direction.NORTH);
         new Wall(kw, 3, 6, Direction.EAST);
         new Wall(kw, 4, 7, Direction.NORTH);
         new Wall(kw, 4, 7, Direction.EAST);
         
         // creating lights on right side of staircase
         
         new Thing(kw, 4, 1);
         new Thing(kw, 3, 2);
         new Thing(kw, 2, 3);
         new Thing(kw, 1, 4);
         
         // navigating jerrycan up the staircase whilst he picks the lights up, placing them in the right spot during his decsent

        
         
         jerrycan.move();
         jerrycan.pickThing();
         jerrycan.turnLeft();
         jerrycan.move();
         jerrycan.turnRight();
         jerrycan.move();
         jerrycan.pickThing();
         jerrycan.turnLeft();
         jerrycan.move();
         jerrycan.turnRight();
         jerrycan.move();
         jerrycan.pickThing();
         jerrycan.turnLeft();
         jerrycan.move();
         jerrycan.turnRight();
         jerrycan.move();
         jerrycan.pickThing();
         
         jerrycan.move();
         jerrycan.putThing();
         jerrycan.move();
         jerrycan.turnRight();
         jerrycan.move();
         jerrycan.putThing();
         jerrycan.turnLeft();
         jerrycan.move();
         jerrycan.turnRight();
         jerrycan.move();
         jerrycan.putThing();
         jerrycan.turnLeft();
         jerrycan.move();
         jerrycan.turnRight();
         jerrycan.move();
         jerrycan.putThing();
         jerrycan.turnLeft();
         jerrycan.move();
         
         
    }       
}
