package HomeWork3;

// Класс StreamComparator для сравнения количества групп в потоке
class StreamComparator implements java.util.Comparator<Поток> {
    @Override
    public int compare(Поток поток1, Поток поток2) {
        return Integer.compare(поток1.учебныеГруппы.size(), поток2.учебныеГруппы.size());
    }
}