public class _BinaryAddition_67 {
    public static String addBinary(String a, String b) {
        int i = a.length()-1, j = b.length()-1;
        int s = 0;

        String result = "";

        while(i >= 0 || j >= 0 || s == 1) {

            s += ((i >= 0)? a.charAt(i) - '0': 0);
            s += ((j >= 0)? b.charAt(j) - '0': 0);

            result = (char)(s % 2 + '0') + result;

            s /= 2;
            i--; j--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(addBinary(args[0], args[1]));
    }
}
