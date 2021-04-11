# Lab-5
1. Выполнение заданий для самостоятельной работы:

1.1. Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода. Один из методов позволяет присвоить значение полю. Еще один метод при вызове возвращает результатом код символа. Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.

1.2. Напишите программу с классом, у которого есть два символьных поля и метод. Он возвращает результат, и у него нет аргументов. При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые находятся «между» символами, являющимися значениями полей объекта (из которого вызывается метод). Например, если полям объекта присвоены значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны выводиться все символы от ‘A’ до ‘D’ включительно.

1.3. Напишите программу с классом, у которого есть два целочисленных поля. В классе должны быть описаны конструкторы, позволяющие создавать объекты без передачи аргументов, с передачей одного аргумента и с передачей двух аргументов.

1.4. Напишите программу с классом, у которого есть символьное и целочисленное поле. В классе должны быть описаны версии конструктора с двумя аргументами (целое число и символ – определяют значения полей), а также с одним аргументом типа double. В последнем случае действительная часть аргумента определяет код символа (значение символьного поля), а дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля. Например, если аргументом передается число 65.1267, то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное поле получит значение 12 (в дробной части учитываются только десятые и сотые).

1.5. Напишите программу с классом, у которого есть закрытое целочисленное поле. Значение полю присваивается с помощью открытого метода. Методу аргументом может передаваться целое число, а также метод может вызываться без аргументов. Если методы вызывается без аргументов, то поле получает нулевое значение. Если метод вызывается с целочисленным аргументом, то это значение присваивается полю. Однако если переданное аргументом методу значение превышает 100, то значением полю присваивается число 100. Предусмотрите в классе конструктор, который работает по тому же принципу что и метод для присваивания значения полю. Также в классе должен быть метод, позволяющий проверить значение поля.

1.6. Напишите программу с классом, в котором есть два закрытых целочисленных поля (назовем их max и min). Значение поля max не может быть меньше значения поля min. Значения полям присваиваются с

помощью открытого метода. Метод может вызываться с одним или двумя целочисленными аргументами. При вызове метода значения полям присваиваются так: сравниваются текущие значения полей и значения аргументов, переданных методу. Самое большое из значений присваивается полю max, а самое маленькое из значений присваивается полю min. Предусмотрите конструктор, который работает по тому же принципу, что и метод для присваивания значений полям. В классе также должен быть метод, отображающий в консольном окне значения полей объекта