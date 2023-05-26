public class ClearLastIbits {

    public static void clear(int n, int i){
        // -0 = 111111..; so when we left shit 1 by i times then we get our favourable bitmask
        int bitmask = ~0 << i;
        System.out.println(bitmask & n);
    }

    public static void main(String[] args) {
        clear(5, 2);
    }
}
