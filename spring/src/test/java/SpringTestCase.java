import com.kaishengit.service.BookService;
import com.kaishengit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.nio.file.Path;

/**
 * Created by Administrator on 2016/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class SpringTestCase {

    @Autowired
    private BookService bookservice;

    @Test
    public void testBookService(){

        bookservice.showBook();

    }

    @Autowired
    private UserService userService;

    @Test
    public  void testSayHi(){
        userService.sayHi();
    }
}
