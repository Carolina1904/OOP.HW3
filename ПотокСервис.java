package HomeWork3;

import java.util.Collections;
import java.util.List;

// Класс ПотокСервис для сортировки списка потоков
class ПотокСервис {
    public static void сортироватьПотоки(List<Поток> потоки) {
        Collections.sort(потоки, new StreamComparator());
    }
}
