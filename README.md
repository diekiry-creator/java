Вариант 4

Создать абстрактный класс Product с методами: 
1. public abstract void init(Scanner scanner) // считывание параметров с консоли
2. public abstract int getCost() // возвращает стоимость товара 
3. public abstract boolean canBuy(int cost) // определяет, можно ли купить товар за имеющуюся сумму 
4. public String toString() // возвращается состояние объекта в виде строки (определяется только в наследниках, т.к. определен в Object) 

Построить иерархию классов: 
  
Товар → Игрушка → Кубик-рубик 

   → Молочный → Сыр  

   → Техника → Камера → Телевизор 

Написать программу, которая:
1. Считывает с консоли количество товаров.
2. В цикле считывает параметры. Сначала спрашивается вид товара и создается объект нужного класса. Затем у объекта вызывается метод init() и вводятся характеристики объекта (стоимость, наименование игрушки, разрешение камеры, размер диагонали телевизора и т.д.). Метод init() разный у разных классов. 
3. Считанные объекты кладутся в массив.
4. Ищется самый дешевый товар и выводится на экран (вывод через toString())
