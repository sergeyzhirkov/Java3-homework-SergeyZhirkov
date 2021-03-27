import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

    }

    public static int[] arrayAfter(int[] arr){
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] == 4) {
                    return Arrays.copyOfRange(arr, i+ 1, arr.length);
            }
        }
        throw new  RuntimeException("no needs element");
    }

    public static boolean arrayContains(int[] arr) {
        boolean one1 = false;
        boolean four4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i]!=4) {
                return false;
            }
            if (arr[i] == 1) {
                one1 = true;
            }
            if (arr[i] == 4) {
                four4 = true;
            }

        }
        return one1 && four4;
    }
}
