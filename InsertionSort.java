public class InsertionSort implements SortingAlgorithm {

    public void sort(int[] a){
        for (int i=1;i<a.length;i++){
            int temp = a[i];
            int j = i-1;
            boolean x = true;
            while (a[i]<a[j] && x){
                a[i]=a[j];
                a[j]=temp;
                if (j!=0){
                    j--;
                    i--;
                }
                else{
                    x=false;
                }
            }
        }
    }
}
