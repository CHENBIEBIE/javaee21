
import com.kaishengit.dao.UserDaoImpl;

import com.kaishengit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemoTestCase {

    @Test
    public void testSayHi(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");


       /* UserDaoImpl userDao = (UserDaoImpl) applicationContext.getBean("userDaoImpl");
        userDao.save();*/
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHi();
    }
}
