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
        Person bob = new Person("Bob");
        Person tom1 = new Person("Tom");
        System.out.println(tom.toString()); // Было переопределение метода toString
        System.out.println(tom.hashCode()); // Хэш-код строкового значения, переопределили
        System.out.println(tom.getClass()); // Получаем тип данного объекта
        System.out.println(tom.equals(bob)); // Сравнение двух объектов на равенство
        System.out.println(tom.equals(tom1)); //Сравнине двух объектов на равенство

        // Исключения, можно обработать и убрать вывод stackTrace и просто написать в логах что-то
        try {
            int[] numbers = new int[3];
            numbers[4] = 45;
            System.out.println(numbers[4]);
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Выброшена ошибка");
        }
    }
}
