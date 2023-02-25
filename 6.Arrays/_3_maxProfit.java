class _3_maxProfit{
    public static int maxProfit(int arr[]) {
        int buyPrice = arr[0];
        int SellingPrice = arr[0];
        int maxProfit = 0;
        for(int i=1;i<arr.length;i++){

            SellingPrice=arr[i];
            if(arr[i]<buyPrice){
                buyPrice = arr[i];
            }

            int profit = SellingPrice - buyPrice; 

            if(profit>maxProfit){
                maxProfit = profit;
                
            }
           
            
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={5,1,7,90,0,100,1000};
        System.out.println(maxProfit(arr));
    }
}