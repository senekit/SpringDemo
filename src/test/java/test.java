
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.csu.domain.Account;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account = (Account)context.getBean("Account");
        account.print();
    }

}
