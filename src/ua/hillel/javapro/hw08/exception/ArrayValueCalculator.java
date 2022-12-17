package ua.hillel.javapro.hw08.exception;

public class ArrayValueCalculator {

    public static int doCalc(String[][] array ) throws ArraySizeException, ArrayDataException {

        if (array.length != 4) throw new ArraySizeException("В массиве " + array.length + " строк вместо 4");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null ) {
                throw new ArraySizeException("Массив не инициализирован!");
            }
            if (array[i].length != 4) {
                throw new ArraySizeException("В массиве в строке " + i + " - " + array[i].length + " значения вместо 4 ");
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0 ; j < array[i].length; j++) {

                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}