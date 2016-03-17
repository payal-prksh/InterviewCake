/**
 * Created by payal on 3/17/16.
 */
public class ComputeProfitFromStocks {


    public static void getMaxProfit(int[] stockPricesYesterday) {

        if(stockPricesYesterday.length < 2)
            throw new IllegalArgumentException("Illegal input: profit requires at least 2 prices");


        int minPrice = stockPricesYesterday[0];
        int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];


        for(int i = 1; i < stockPricesYesterday.length; i++) {

            int currentPrice = stockPricesYesterday[i];

            int potentialProfit = currentPrice - minPrice;
            maxProfit = Math.max(potentialProfit, maxProfit);
            minPrice = Math.min(currentPrice, minPrice);
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }



    public static void main(String[] args) {

        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
        int[] fallingstockPricesYesterday = new int[]{10, 7, 5, 4, 3, 2};

        getMaxProfit(stockPricesYesterday);
        getMaxProfit(fallingstockPricesYesterday);

    }

}
