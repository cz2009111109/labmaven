package log4j;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.frasergen.dao.PurchaseOrderDao;
import com.frasergen.dao.UserDao;
import com.frasergen.entity.PurchaseOrder;
import com.frasergen.entity.Share;
import com.frasergen.entity.User;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class Test02 {
	
	
	
	@Autowired
	UserDao userdao;
	
	@Autowired
	PurchaseOrderDao purchaseOrderDao;
	
	@Test
	public void userDaoTest(){
		System.out.println("test开始");
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
	}
	
}
