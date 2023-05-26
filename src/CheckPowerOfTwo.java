public class CheckPowerOfTwo {

    public static void checkPowerOfTwo(int n){
        int power = n & (n-1);
        if(power == 0){
            System.out.println("number is power of 2");
        } else {
            System.out.println("number is not power of two");
        }
    }

    public static void main(String[] args) {
        checkPowerOfTwo(512);
    }
}
