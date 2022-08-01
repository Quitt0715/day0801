package cn.quitt;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Market
 *
 * @author Quitt
 **/
public class Market {
    /**
     * 结账
     *
     * @param fullReduction 是否满减
     * @param fruits        水果列表
     * @return 总价
     */
    public static double invoicing(boolean fullReduction, Fruit... fruits) {
        double sumPrice = 0;
        for (Fruit fruit : fruits) {
            sumPrice += fruit.getPrice() * fruit.getDiscount() * fruit.getWeight();
        }
        if (fullReduction && sumPrice > 100) {
            return sumPrice - (int) (sumPrice / 100) * 10;
        }
        return sumPrice;
    }
}
