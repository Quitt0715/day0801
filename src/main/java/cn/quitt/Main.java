package cn.quitt;

/**
 * Main
 *
 * @author Quitt
 **/
public class Main {
    public static void main(String[] args) {
        //1.苹果5斤、草莓10斤
        double APrice = Market.invoicing(false, new Fruit("苹果", 8, 5), new Fruit("草莓", 13, 10));
        System.out.println("APrice = " + APrice);
        //2.苹果5斤、草莓10斤、芒果1斤
        double BPrice = Market.invoicing(false, new Fruit("苹果", 8, 5), new Fruit("草莓", 13, 10), new Fruit("芒果", 20, 1));
        System.out.println("BPrice = " + BPrice);
        //3.草莓8折
        double CPrice = Market.invoicing(false, new Fruit("苹果", 8, 5), new Fruit("草莓", 13, 0.8, 10), new Fruit("芒果", 20, 1));
        System.out.println("CPrice = " + CPrice);
        //4.草莓8折、满100-10
        double DPrice = Market.invoicing(true, new Fruit("苹果", 8, 5), new Fruit("草莓", 13, 0.8, 10), new Fruit("芒果", 20, 1));
        System.out.println("DPrice = " + DPrice);
    }
}
