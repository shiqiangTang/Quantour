package businessHelperTest;

import bussinesslogic.helper.AVGGetComparator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class AvgTest {
    
	@Test
	public void LimitTest() {
		ArrayList<String > list=AVGGetComparator.removeLimitInAll(new Date("2013/5/7"));
		System.out.println(AVGGetComparator.selectHighStocks(list, 10, 10, new Date("2013/5/7")));
		System.out.println(list.size());
	}
}
