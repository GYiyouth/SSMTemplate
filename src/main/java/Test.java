import persistence.mybatis.interfaces.Test2;
import tool.com.BeanFactory;

/**
 * Created by geyao on 2017/3/23.
 */
public class Test {
    public static void main(String[] args) {
        Test2 test2 = BeanFactory.getBean("test2", Test2.class);
        System.out.println(test2.getTest1().select1());
//        System.out.println(test2.getTest3().select1());
    }
}
