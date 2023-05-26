public class ClearLastIbits {

    public static void clear(int n, int i){
        // -0 = 111111..; so when we left shit 1 by i times then we get our favourable bitmask
        int bitmask = (~0) << i;
        System.out.println(bitmask & n);
    }
    public static void clearBitsinRange(int n, int i, int j){
        // -0 = 111111..; so when we left shit 1 by i times then we get our favourable bitmask
        int a = (~0) << j + 1;
        int b = (1<<i) - 1; // this is no of ones on right
        int bitmask = a | b;
        System.out.println(bitmask & n);
    }


    public static void main(String[] args) {
//        clear(15, 2);
        clearBitsinRange(31, 1, 3);
    }
}
