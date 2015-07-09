import static org.junit.Assert.*;

import org.junit.Test;


public class EMVTestCase {
EVM e=new EVM();

	@Test
	public void test1() {
		//fail("Not yet implemented");
		e.setCndidate("a", 25, "abc1", 0);
		e.setCndidate("b", 29, "abc2", 0);
		e.setVotes("a");
		e.setVotes("a");
		e.setVotes("a");
		e.setVotes("b");
		assertEquals("a", e.countVotes());
		e.reset();
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		e.reset();
		e.setCndidate("a", 25, "abc1", 0);
		e.setCndidate("b", 29, "abc2", 0);
		e.setVotes("b");
		e.setVotes("b");
		e.setVotes("b");
		e.setVotes("a");
		assertEquals(4, EVM.getTotalNumberOfVotes());
		  
	}
}
