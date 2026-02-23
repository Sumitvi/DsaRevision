package arrays.advaceArrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {

//        Stock Buy and Sell
//         Best Time to Buy and Sell Stock
//        Buy at min Price
//        Sell at maxPrice
        int prices[] = {7,1,5,3,6,4};
        int minPri = Integer.MAX_VALUE;
        int maxPri = 0;

        for(int i=0; i<prices.length; i++){

            minPri = Math.min(minPri , prices[i]);
            maxPri = Math.max(maxPri , prices[i] - minPri);
        }

        System.out.println("The Maximum Profit is : "+ maxPri);


    }
}
