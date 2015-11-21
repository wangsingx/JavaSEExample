package datatype;

/**
 * Created by wangxing on 11/21/2015.
 */
import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) throws Exception {
        BigDecimal bd1 = new BigDecimal(123456789.123456789);
        BigDecimal bd2 =BigDecimal.valueOf(123L);
        bd1 = bd1.add(bd2);
        System.out.println(bd1);
    }
}
