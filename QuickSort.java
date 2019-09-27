public class QuickSort implements SortingAlgorithm {

    public void sort(int[] a) {
        qs(a, 0, a.length - 1);
    }

    public static void qs(int[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            qs(a, left, p-1);
            qs(a, p+1, right);
        }
    }

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }




}