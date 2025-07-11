
public class Buystock {

    public static int buyandsell(int price[]) {

        int buyPrice = Integer.MAX_VALUE;
        System.err.println(5-buyPrice);
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {

                int profit = price[i] - buyPrice;
                //System.err.println(profit);
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }

        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[]={5,7,5,2};

        System.out.println(buyandsell(prices));

    }
}
