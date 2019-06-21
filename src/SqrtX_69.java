public class SqrtX_69 {
    private static int mySqrt(int x) {
        int i;
        for (i = 0; i <= x/2; i++) {
            if (i * i == x || Math.pow(i+1, 2) > x) {
                break;
            }
            else {
                continue;
            }
        }

        return i;
    }

    private static int mySqrtBS(int x) {
        int st = 0;
        int end = x;
        int target = x;

        while(st <= end){
            int mid = st + (end - st) / 2;

            // check for overflow
            if(mid > 46340){
                end = mid - 1;
            }
            else if(target == mid * mid){
                return mid;
            }
            else if(target < mid * mid){
                end = mid-1;
            }else{
                st = mid+1;
            }

        }

        return end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrtBS(Integer.parseInt(args[0])));
    }
}
