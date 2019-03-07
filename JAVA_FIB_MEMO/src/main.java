public class main {
    public static int fib(int num, int arr[])
    {
        if (num == 1 || num == 2)
            return 1;
        if (arr[num] == 0) {
            int result = fib(num - 1, arr) + fib(num - 2, arr);
            return result;
        }
        return arr[num];
    }
    public static void main(String arg[])
    {
        int val = 20;
        int [] memArray = new int[val+1];
        for (int i = 0; i <= val; i ++)
            memArray[i] = 0;
        System.out.println(fib(val, memArray));
    }
}
