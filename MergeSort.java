public class MergeSort implements SortingAlgorithm {


    public void sort(int[] a){
        split(a);
    }

    void split(int[] a){
        int half;
        if (a.length>=4){
            half = (a.length)/2;
        }
        else{
            if (a.length==3){
                half = 2;
            }
            else{
                half = 1;
            }
        }
        int[] b = new int[half];
        for (int i = 0; i<half; i++){
            b[i]=a[i];
        }
        int[] d = new int[a.length-half];
        for (int j = half; j<a.length; j++){
            d[j-half] = a[j];
        }
        if (half>1){
            split(b);
            split(d);
        }
        a = merge(b,d,a);
    }

    int[] merge(int[] a, int[] b, int[] c){
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length & j<b.length){
            if (a[i]<=b[j]){
                c[k++]=a[i++];
            }
            else {
                c[k++]=b[j++];
            }
        }
        while (i<a.length){
            c[k++]=a[i++];
        }
        while (j<b.length){
            c[k++]=b[j++];
        }
        return c;

    }

}
