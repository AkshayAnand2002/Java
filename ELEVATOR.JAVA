/*
Requirements:
In a multistoried building, there is one elevator. There are buttons in every floor to request for the elevator. Let us assume that only one button is pressed at a time and no button is pressed until a request is serviced. 
Once the button is pressed, the elevator does the following:
•	goes to the requested floor
•	opens the door
•	waits
•	closes the door
•	goes to the ground floor
•	opens the door
•	waits
•	closes the door
For the sake of simplicity, we are assuming that we are using the elevator only to go to the ground floor.
class Elevator{
int currentFloor;
void setCurrentFloor(){
currentFloor = 0;
}
void openDoor(){
	System.out.println(“Door opened”);
}
void waitDoor(){
	System.out.println(“Door waiting”);
}
void closeDoor(){
	System.out.println(“Door closed”);
}
void moveUp(int numberOfFloors){
	currentFloor = currentFloor + numberOfFloors;
}
void moveDown(int numberOfFloors){
	currentFloor = currentFloor - numberOfFloors;
}
void resetCurrentFloor(int floor){
//……write the logic for resetting the value of currentFloor of the elevator here……
}
}
class Request{
int floor;
public static void main(String args[]){
		floor = 1; // execute it with different values of floor and observe the output
		Elevator e = new Elevator();
		e.resetCurrentFloor(floor);
}
}
*/
//ELEVATOR
import java.util.Scanner;
public class Main
{       static int currentfloor=0;
		static void setcurrentfloor(){
		    currentfloor=0;
		}
		static void opendoor(){
		    System.out.println("DOOR OPENED.");
		}
		static void waitdoor(){
		    System.out.println("DOOR IS WAITING.");
		}
		static void closedoor(){
		    System.out.println("DOOR CLOSED.");
		}
		static void moveup(int nooffloors){
		    currentfloor=currentfloor+nooffloors;
		    System.out.println();
		    System.out.println("YOU ARE ON FLOOR NO. "+currentfloor);
		}
		static void movedown(int nooffloors){
		    currentfloor=currentfloor-nooffloors;
		    System.out.println();
		    System.out.println("YOU ARE ON FLOOR NO. "+currentfloor);
		}
		static void resetcurrentfloor(int floor){
		    setcurrentfloor();
		    moveup(floor);
		    opendoor();
		    waitdoor();
		    closedoor();
		    movedown(floor);
		    opendoor();
		    waitdoor();
		    closedoor();
		}
	public static void main(String[] args) {
		    Scanner b= new Scanner(System.in);
		    System.out.println("Enter the floor number you want to go to");
		    int flor=b.nextInt();
		    resetcurrentfloor(flor);
		    b.close();

		}
}
