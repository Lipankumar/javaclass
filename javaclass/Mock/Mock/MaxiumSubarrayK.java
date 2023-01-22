

public class MaxiumSubarrayK {
    public static void main(String[] args) {
        int[] arr={ 12, 1, 78, 90, 57, 89, 56};
        int n=arr.length;
        int k=3;
        findMax(arr, n, k);
    }
    public static void findMax(int[] arr,int n,int k) {
        int max;
        for(int i=0;i<n-k+1;i++){
            max=arr[i];
            for(int j=1;j<k;j++){
                if(arr[i+j]>max){
                    max=arr[i+j];
                }
            }
            System.out.print(max+" ");
        }
    }
}
