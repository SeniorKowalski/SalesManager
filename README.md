#**Программа для анализа статистики продаж**

##Инструкция по использованию:
* С помощью конструктора класса SalesManager создаём объект класса.
* Аргументом конструктора помещаем интовый массив с продажами.
* Вызываем у созданного объекта класса SalesManager метод max().
* Получаем наибольшее число из массива.

```java
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new int[] {250, 152, 244, 121, 165, 320, 333});
        System.out.println(manager.max());
    }
    //Результат вывода в консоль: 333
```
