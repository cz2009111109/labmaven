package log4j;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.frasergen.dao.CommodityDao;
import com.frasergen.dao.ItemDao;
import com.frasergen.dao.PurchaseOrderDao;
import com.frasergen.dao.UserDao;
import com.frasergen.entity.Item;
import com.frasergen.entity.PurchaseOrder;
import com.frasergen.entity.Share;
import com.frasergen.entity.User;
import com.frasergen.service.CommodityService;
import com.frasergen.util.MultipleDataSource;



@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring-mybatis2.xml"}) 
public class Test02 {
	
	
	
	@Autowired
	UserDao userdao;
	
	@Autowired
	PurchaseOrderDao purchaseOrderDao;
	
	@Autowired
	CommodityService commodityService;
	
	@Autowired
	CommodityDao dao;
	
	@Autowired
	ItemDao itemDao;
	@Test
	public void userDaoTest(){
		System.out.println("test开始");
		//CustomerContextHolder.setCustomerType("dataSourceOne");
		
		List<User> list=userdao.queryAll();
		for(User user:list){
			System.out.println(user.getName());
			
		}
		List<PurchaseOrder> list1=purchaseOrderDao.queryAll();
		System.out.println(list1.size());
		Share share=userdao.getShare(list.get(0));
		System.out.println("********************");
		System.out.println(share.toString());
		System.out.println("test结束");
		MultipleDataSource.setDataSourceKey("dataSourceTwo");
		List<Item> list2= itemDao.queryAll();
		for(Item item:list2){
			System.out.println(item.getCustomer());
		}
		
		
		MultipleDataSource.setDataSourceKey("dataSourceOne");
		System.out.println("test开始");
		//CustomerContextHolder.setCustomerType("dataSourceOne");
		
		List<User> list3=userdao.queryAll();
		for(User user:list3){
			System.out.println(user.getName());
			
		}
		System.out.println("test结束");
		
	}
	
	/*@Test
	public void commodityTest(){
		System.out.println("test开始");
		PageUtil pg=new PageUtil();
		List<Commodity> list=commodityService.queryAll(pg).getList();
		System.out.println(list.size());
		for(Commodity commodity:list){
			System.out.println(commodity.getGoodsname());
			
		}
		System.out.println("********************");
		System.out.println("test结束");
	}*/
}
