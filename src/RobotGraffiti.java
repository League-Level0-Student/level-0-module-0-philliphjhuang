import org.jointheleague.graphical.robot.Robot;

// This recipe draws the first letter of your name using the Robot
//
// 1. Create a class called RobotGraffiti
// 2. Use the Robot to draw the first letter of your name
// HINT: Use the RobotSquare recipe to help remember how to draw using Robot
// 3. BONUS: Write your entire first name using the Robot
public class RobotGraffiti {
	Robot r = new Robot();
	public static void main(String[] args) throws Exception {
		 
Robot r = new Robot();
r.penDown();
r.setRandomPenColor();
r.setSpeed(10);
r.move(200);
r.move(50);
r.move(-50);
for(int i=0;i<360;i++){
	r.move(1);
	r.turn(1);
	
}
r.hide();
	}
}