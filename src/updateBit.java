public class updateBit extends GetSetClearBit{

    public static void updateBit (int n, int i, int bit){
        clearBit(n, i);
        int bitMask = bit << i;
        System.out.println(bitMask | n);
    }

    public static void main(String[] args) {
        updateBit(5, 3, 1);
    }
}
