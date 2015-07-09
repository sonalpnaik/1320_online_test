 

public class EVM {
BallotingUnit buList;
ControlUnit  cuList;
static int totalNumberOfVotes=0;
public static int getTotalNumberOfVotes() {
	return totalNumberOfVotes;
}

public static void setTotalNumberOfVotes(int totalNumberOfVotes) {
	EVM.totalNumberOfVotes = totalNumberOfVotes;
}

public EVM(BallotingUnit buList, ControlUnit cuList) {
	super();
	this.buList = buList;
	this.cuList = cuList;
}

public EVM() {
	// TODO Auto-generated constructor stub
	buList=new BallotingUnit();
	cuList=new ControlUnit();
}

public BallotingUnit getBuList() {
	return buList;
}

public void setBuList(BallotingUnit buList) {
	this.buList = buList;
}

public ControlUnit getCuList() {
	return cuList;
}

public void setCuList(ControlUnit cuList) {
	this.cuList = cuList;
}


public void setCndidate(String candName,int age,String party,int noOfVotes){
	 cuList.setcandiate(candName, age, party, noOfVotes);
}
public void setVotes(String candName){
	 cuList.setVotes(candName);
	 totalNumberOfVotes=totalNumberOfVotes+1;
}
public String countVotes(){
	String winner=cuList.countvote();
	return winner;
}
public void reset(){
	totalNumberOfVotes=0;
	cuList.reset();
}
}
