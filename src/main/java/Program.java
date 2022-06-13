public class Program {

    public static void main(String[] args) {

        Book book = new Book("Java. Complete Referense", "H. Shildt");
        book.print();

        Journal journal = new Journal("Foreign Policy"); // Создание экземпляра и передача атрибутов
        journal.print(); // Выполнение над объектом

        Printable1.read(); // Статический метод, не надо создавть экземпляр класса, а просто вызвать нужный метод

        WaterPipe pipe = new WaterPipe();
        pipe.printState(0);
        pipe.print();

        Person tom = new Person("Tom");
        System.out.println(tom.toString()); // Было переопределение метода toString
        System.out.println(tom.hashCode()); // Хэш-код строкового значения, переопределили
        System.out.println(tom.getClass()); // Получаем тип данного объекта

    }
}
