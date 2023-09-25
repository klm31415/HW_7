public class ArrayValueCalculator {

    public static String[][] checkArray(String[][] calcArray) throws ArraySizeException {
        int size1 = calcArray.length;
        int size2 = calcArray[0].length;
        if (size1 != 4 || size2 != 4) throw new ArraySizeException("Размер массива не соответсвует заданному 4х4");
        return calcArray;
    }

    public static int doCalc(String[][] calcArray1) throws ArrayDataException {
        int result = 0;
        try {
            checkArray(calcArray1);
        } catch (ArraySizeException e) {
            System.out.println(e);
        }

        for (int i = 0; i < calcArray1.length; i++) {
            for (int j = 0; j < calcArray1[i].length; j++) {
                try {
                    result = result + Integer.parseInt(calcArray1[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return result;
    }
}
