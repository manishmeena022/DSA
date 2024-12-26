public class BuyAndSellStock {

    public static int findMaxProfit(int arr[]){
        int n = arr.length;
        int maxProfit = 0;

        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    maxProfit = Math.max(arr[j] - arr[i], maxProfit);
                }
            }
        }
        return  maxProfit;
    }

    public static int maxProfit(int arr[]){
        int n = arr.length;
        int maxPr = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            minPrice = Math.min(arr[i], minPrice);
            maxPr = Math.max(maxPr, arr[i] - minPrice);
        }

        return maxPr;
    }

    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(findMaxProfit(prices));
    }
}