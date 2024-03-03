package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Класс Поток, реализующий интерфейс Iterable
class Поток implements Iterable<УчебнаяГруппа> {
    List<УчебнаяГруппа> учебныеГруппы = new ArrayList<>();

    public void добавитьГруппу(УчебнаяГруппа группа) {
        учебныеГруппы.add(группа);
    }

    @Override
    public Iterator<УчебнаяГруппа> iterator() {
        return учебныеГруппы.iterator();
    }
}
