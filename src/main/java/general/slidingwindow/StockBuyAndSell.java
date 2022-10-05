package general.slidingwindow;

import java.time.LocalDateTime;

public class StockBuyAndSell {

    public static void main(String[] args) {
        int[] prices = {7, 2, 5, 1, 6, 4, 7, 2};
        System.out.println(LocalDateTime.now());
        int maxprofit = 0;
        int lowestPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            } else {
                if (prices[i] - lowestPrice > maxprofit) {
                    maxprofit = prices[0] - lowestPrice;
                }
            }

        }
        System.out.println(maxprofit);
        System.out.println(maxprofit);
        System.out.println(LocalDateTime.now());

    }
}
