public class GetSetClearBit {

    public static void getBit (int n, int i) {
        int bitMask = 1 << i;
        if ((bitMask & n) > 0){
            System.out.println("the bit is 1");
        } else {
            System.out.println("the bit is 0");
        }
    }
    public static void setBit (int n, int i) {
        int bitMask = 1 << i;
        System.out.println(bitMask | n);
    }
    public static void clearBit (int n, int i) {
        int bitMask = 1 << i;
        System.out.println(~bitMask & n);
    }

    public static void main(String[] args) {
        getBit(5, 3);
        setBit(5, 3);
        clearBit(3, 0);
    }
}
