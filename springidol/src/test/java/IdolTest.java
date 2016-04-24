import com.springinaction.springidol.PerformanceExecption;
import com.springinaction.springidol.Performer;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by dujiang on 2016/4/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/springinaction/springidol/spring-idol-props.xml"})
public class IdolTest {
    @BeforeClass
    public static void setup(){

    }
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void doDuke() throws PerformanceExecption {
//        Performer performer = (Performer) applicationContext.getBean("duke");//poeticJuggler1
//        Performer performer = (Performer) applicationContext.getBean("poeticJuggler2");//
        Performer performer = (Performer) applicationContext.getBean("oneManBand3");//
        performer.perform();

    }



}





















