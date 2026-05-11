public class Main {
    public static void main(String[] args) {
        int[] n = GetNumbers();   // n = GetNumbers()
        print(n);                 // print(n)
    }

    static int[] GetNumbers() {
        return GetNumbers.getNumbers1To100();
    }

    static void print(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
   class GetNumbers {
        public static int[] getNumbers1To100() {
            int[] v = new int[100];
            for (int i = 0; i < v.length; i++) v[i] = i + 1;
            return v;
        }
    }