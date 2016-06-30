import com.kaishengit.dao.UserDao;
import com.kaishengit.service.BookService;
import com.kaishengit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/6/30.
 */
public class SpringDemoTestCase {

    @Test
    public void testSayHi(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");


       /* BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.showBook();*/

        UserService userService = (UserService) applicationContext.getBean("userService");//传入的bean中被调用的id

        userService.sayHi();

        /*UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        userDao.sayHi();

        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");

        userDao2.sayHi();

        System.out.println(userDao==userDao2);*/
    }
}
