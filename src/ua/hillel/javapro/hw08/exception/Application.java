package ua.hillel.javapro.hw08.exception;

public class Application {
    public static void main(String[] args) {

        String[][] array = {{"1","2","3","4"}, {"5","6","7","8"}, {"9", "10", "11","12"}, {"13","14","15","16"}};
        //String[][] array = {{"1","2","3","4"}, {"5","6","7","8"}, {"9", "rterter", "11","12"}, {"13","14","15","16"}};
        //String[][] array = {{"1","2"}, {"5","6","7","8"}, {"9", "з", "11","12"}, {"13","14","15","16"}};
        //String[][] array = new String[4][];  // проверка если массив не инициализирован
        //String[][] array = {{"1","2","3","4"}, null, {"9", "з", "11","12"}, {"13","14","15","16"}};


        try {
            System.out.println("Сумма масива: " + ArrayValueCalculator.doCalc(array));
        } catch (ArraySizeException ase) {
            System.out.println(ase);
        } catch (ArrayDataException ade) {
            System.out.println(ade);
        }
    }
}
