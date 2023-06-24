public class Listproduct {
    // Write a recursive function that takes a list of
    // numbers as an input and return product of all
    // numbers in list.
    static int Calulate(int[] number) {
        return CalculateProduct(number, 0);
    }

    static int CalculateProduct(int[] number, int index) {
        if (index == number.length) {
            return 1;
        }

        else {
            return number[index] * CalculateProduct(number, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5 };
        int product = Calulate(number);
        System.out.println(product);
    }
}
