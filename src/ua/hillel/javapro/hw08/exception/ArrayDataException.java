package ua.hillel.javapro.hw08.exception;

class ArrayDataException extends NumberFormatException {
    private int x;
    private int y;

    public ArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return getClass().getName() + " В массиве в ячейке [" + x + ", " + y + "] не число";
    }
}
