package dataService;

import po.StockPO;

import java.util.Date;
import java.util.Map;

public interface StockDataService {
	public Map<Date, StockPO> getSpecificDateStock(Date start,Date end,int stockPOId);
	
	public Map<Date, StockPO> getSpecificDateStock(Date start,Date end,String name);
	
	public Map<Integer,StockPO> getStocksByDate(Date date);
	
	public Map<String,Integer> searchStock(String nameOrCode);
    
}
