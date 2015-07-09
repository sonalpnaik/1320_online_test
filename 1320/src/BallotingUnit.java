import java.lang.reflect.Array;
import java.util.ArrayList;


public class BallotingUnit {
	ArrayList<Candidate> candlist=new ArrayList<Candidate>();
 
boolean lamp;
boolean button;
 
public boolean isLamp() {
	return lamp;
}
public void setLamp(boolean lamp) {
	this.lamp = lamp;
}
public boolean isButton() {
	return button;
}
public void setButton(boolean button) {
	this.button = button;
}
public BallotingUnit(ArrayList<Candidate> candlist, boolean lamp, boolean button) {
	super();
	this.candlist = candlist;
	this.lamp = lamp;
	this.button = button;
}
public BallotingUnit() {
	// TODO Auto-generated constructor stub
}
 

}
