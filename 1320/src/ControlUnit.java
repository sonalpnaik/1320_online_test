import java.util.ArrayList;


public class ControlUnit {
int counter;
ArrayList<Candidate> candList=new ArrayList<Candidate>();
Candidate c;
BallotingUnit bu;
public int getCounter() {
	return counter;
}
public void setCounter(int counter) {
	this.counter = counter;
}
public BallotingUnit getBu() {
	return bu;
}
public void setBu(BallotingUnit bu) {
	this.bu = bu;
}
public ControlUnit(int counter, BallotingUnit bu) {
	super();
	this.counter = counter;
	this.bu = bu;
}
 
public ControlUnit() {
	// TODO Auto-generated constructor stub
}
public void setcandiate(String candName,int age,String party,int noOfVotes) {
	// TODO Auto-generated method stub
	candList.add(new Candidate(candName, age, party, noOfVotes));
}
public void setVotes(String candName) {
	// TODO Auto-generated method stub
	 for(int i=0;i<candList.size();i++){
		 if(candList.get(i).name.equals(candName)){
			 candList.get(i).inVotes();
			 return;
		 }
	 }
}
public String countvote() {
	int no=0;
	String name = null;
	// TODO Auto-generated method stub
	for(int i=0;i<candList.size();i++){
		 if(candList.get(i).getNoOfVotes()>no){
			 no=candList.get(i).getNoOfVotes();
			 name=candList.get(i).getName();
		 }
	 }
	return name;
}

}
