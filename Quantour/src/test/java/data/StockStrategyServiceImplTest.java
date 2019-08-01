package data;

import dataService.StockDataService;
import org.junit.Before;
import org.junit.Test;
import po.StockPO;
import utility.DateHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StockStrategyServiceImplTest {
	StockStrategyServiceImpl impl;
	@Before
	public void setUpBeforeClass() {
		impl = new StockStrategyServiceImpl();
	}

	/*@Test
	public void testGetSomeStocks() {
		impl.getSomeStocks(date, stockLists)
	}
*/
	/*@Test
	public void testGetYieldOfSelectsStocks() {
		fail("Not yet implemented");
	}
*/

	@Test
	public void testGetSomeStocksOfSomeDays() {
		ArrayList<String> list = new ArrayList<>();
		list.add("深发展A");
		list.add("招商地产");
		
		Map<String,Map<Date,StockPO>> map = impl.getSomeStocksOfSomeDays(DateHelper.stringToDate("2011-04-12"), 10, list);
		for (String string : map.keySet()) {
			Map<Date,StockPO> map2 = map.get(string);
			for (StockPO stockPO : map2.values()) {
				System.out.println(stockPO);
			}
		}
	}
	
	@Test
	public void test1(){
		StockDataService service=new StockDataServiceImpl();
		Map<Date, StockPO> list1=service.getSpecificDateStock(new Date("2013/03/22"), new Date("2013/4/21"), 1);
		list1.remove(new Date("2013/3/25"));
	    Map<Date, StockPO> list2=service.getSpecificDateStock(new Date("2013/03/22"), new Date("2013/4/21"), 1);
	    assertEquals(list1.size(), list2.size());
	}
	
	//Tue Mar 29 00:00:00 CST 2011
	//Tue Mar 29 00:00:00 CST 2011
	
}
