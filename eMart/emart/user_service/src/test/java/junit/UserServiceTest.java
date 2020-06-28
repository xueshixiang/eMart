package junit;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emart.user.entity.Buyer;
import com.emart.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserService.class )
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testBuyerSignUp() {
		Buyer buyer = new Buyer();
		buyer.setId(1);
		buyer.setUserName("Zhang San");
		buyer.setPassword("123456");
		buyer.setMobileNumber("13943118037");
		buyer.setEmailId("zhangsan_1981@163.com");
		Date date = new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
		buyer.setCreatedDatetime(dateFormat.format(date));
		userService.saveBuyer(buyer);
	}
	
}
