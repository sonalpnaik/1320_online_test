import java.util.Scanner;


public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EVM e=new EVM();
System.out.println("Enter number of candidates");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){
	System.out.println("Enter name,age,party of candidates");
	e.setCndidate(sc.next(), sc.nextInt(), sc.next(), 0);
}
e.setVotes("a");
e.setVotes("b");
e.setVotes("a");
e.setVotes("a");
System.out.println("Winner is => "+e.countVotes());
	}

}
