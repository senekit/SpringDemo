
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.csu.domain.Account;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
    @Autowired
    private Account account;
    @Test
    public void test(){
      //  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      //  Account account = (Account)context.getBean("Account");
        account.print();
    }

}
