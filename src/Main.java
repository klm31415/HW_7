import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        String[][] calcArray = {{"4", "4", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}};

        System.out.println("Сумма элементов массива: " + ArrayValueCalculator.doCalc(ArrayValueCalculator.checkArray(calcArray)));
    }

}