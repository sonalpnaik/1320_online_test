import static org.junit.Assert.*;

import org.junit.Test;


public class EMVTestCase {
EVM e=new EVM();

	@Test
	public void test() {
		//fail("Not yet implemented");
		e.setCndidate("a", 25, "abc1", 0);
		e.setCndidate("b", 29, "abc2", 0);
		e.setVotes("a");
		e.setVotes("b");
		e.setVotes("a");
		e.setVotes("a");
		assertEquals("a", e.countVotes());
	}

}
