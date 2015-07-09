
public class Candidate {
String name;
int age;
String party;
static int noOfVotes;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getParty() {
	return party;
}
public void setParty(String party) {
	this.party = party;
}
public int getNoOfVotes() {
	return noOfVotes;
}
public void setNoOfVotes(int noOfVotes) {
	this.noOfVotes = noOfVotes;
}
public Candidate(String name, int age, String party, int noOfVotes) {
	super();
	this.name = name;
	this.age = age;
	this.party = party;
	this.noOfVotes = noOfVotes;
}
public void inVotes(){
	noOfVotes=noOfVotes+1;
}
public void reset() {
	// TODO Auto-generated method stub
	noOfVotes=0;
}
}
