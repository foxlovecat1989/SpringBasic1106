package di;

import com.mycompany.springbasic1106.di.Lotto;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Lotto {
    ClassPathXmlApplicationContext ctx = 
            new ClassPathXmlApplicationContext("beans-config.xml");
    @Test
    public void t1(){
        
        // isSingleton() = true
//        Lotto lotto1 = ctx.getBean("lotto", Lotto.class);
//        System.out.println(lotto1);
//        Lotto lotto2 = ctx.getBean("lotto", Lotto.class);
//        System.out.println(lotto2);
        
//        Lotto lotto3 = ctx.getBean("lotto2", Lotto.class);
//        System.out.println(lotto3);
//        Lotto lotto4 = ctx.getBean("lotto2", Lotto.class);
//        System.out.println(lotto4);
        
          Lotto lotto5 = ctx.getBean("lotto3", Lotto.class);
          System.out.println(lotto5);
    }
}
