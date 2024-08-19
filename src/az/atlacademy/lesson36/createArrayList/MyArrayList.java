package az.atlacademy.lesson36.createArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements = null;
    private int size = 0;

    // Listə element əlavə etmək üçün metod
    public void add(T element) {
        if (elements == null) {
            // İlk element əlavə olunanda array-i 1 ölçüsündə başlatırıq
            elements = new Object[1];
        } else {
            // Mövcud array doludursa, ölçünü artırırıq
            grow();
        }
        elements[size++] = element;
    }

    // Elementi geri qaytarmaq üçün metod
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    // Array-in ölçüsünü böyütmək üçün metod
    private void grow() {
        // Yeni array-in ölçüsü +1 olacaq
        elements = Arrays.copyOf(elements, size + 1);
    }

    // Hal-hazırkı ölçünü geri qaytarmaq üçün metod
    public int size() {
        return size;
    }

    // Listin elementlərini çap etmək üçün metod
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    @Override
    public String toString() {
        return "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}