package my;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author liujie
 * @date 2019/9/22
 */
public class TEST {



    @Test
    public void test() {
        ResourceBundle rb;
        try {
            rb = ResourceBundle.getBundle("my.debug", Locale.getDefault());
        } catch (MissingResourceException e) {
            throw new Error("找不到my.debug.properties文件", e);
        }
    }

}
