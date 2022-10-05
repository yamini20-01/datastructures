package Everbridge;

public class mergeSort {
    public static void main(String[] args){
        int[] arr={9,2,4,8,1,7,1};
        int l=0,h=arr.length,i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After sorting");
        mergeSort(arr,0,arr.length);
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void mergeSort(int arr[],int l,int h){
       if(l<h){
           int mid=(l+h)/2;
           mergeSort(arr,l,mid);
           mergeSort(arr,mid+1,h);
           merge(arr,l,mid,h);
       }
    }
    public static void merge(int arr[],int mid,int l,int h){
        int[] temp=new int[100];
        int i = l,j=mid,k=0;
        while(i<=mid && j<h){
         if(arr[i]<arr[j]){
             temp[k]=arr[i];
             i++;
         }
         else{
             temp[k]=arr[j];
             j++;
         }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<h){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(i=0;i<arr.length;i++){
            arr[i]=temp[k];
            k++;
        }
    }
}
