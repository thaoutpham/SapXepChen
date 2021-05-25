public class InsertionSort {
    static int array[]={1,34,5,4,6,68,2,1,44,7,85,58,6,83};
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
