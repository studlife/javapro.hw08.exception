package ua.hillel.javapro.hw08.exception;

public class ArrayValueCalculator {

    public static void main(String[] args){
        String[][] array = {{"1","2","3","4"}, {"5","6","7","8"}, {"9", "з", "11","12"}, {"13","14","15","16"}};
        //String[][] array = new String[4][];  // проверка если массив не инициализирован
        //String[][] array = {{"1","2","3","4"}, null, {"9", "з", "11","12"}, {"13","14","15","16"}};

        try {
            System.out.println("Сумма масива: " + doCalc(array));
        } catch (ArraySizeException ase) {
            System.out.println(ase);
        } catch (ArrayDataException ade) {
            System.out.println(ade);
        }
    }



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


class ArraySizeException extends Exception {

    public ArraySizeException(String message) {
        super(message);
    }
}

class ArrayDataException extends NumberFormatException {
    private int x;
    private int y;

    public ArrayDataException(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return getClass().getName() + " В массиве в ячейке [" + x + ", " + y + "] не число";
    }
}