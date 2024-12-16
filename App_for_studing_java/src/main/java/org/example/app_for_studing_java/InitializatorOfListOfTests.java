package org.example.app_for_studing_java;

public class InitializatorOfListOfTests {

    static public void intiateTest1(){

        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що таке JVM?","A. Java Virtual Memory","B. Java Version Manager","C. Java Virtual Machine","D. Java Variable Method",new int[]{3}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що таке інкапсуляція?","A. Створення об'єктів","B. Приховування даних","C. Спадкування методів","D. Використання змінних",new int[]{2}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Який модифікатор доступу дозволяє доступ лише в межах одного класу?","A. public","B. protected","C. default","D. private",new int[]{4}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Який тип виключення є перевіреним?","A. NullPointerException","B. IOException","C. ArithmeticException","D. ArrayIndexOutOfBoundsException",new int[]{2}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що таке поліморфізм?","A. Використання одного інтерфейсу для різних типів даних","B. Наслідування класів","C. Створення методів","D. Створення об'єктів",new int[]{1}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Який з цих класів є абстрактним?","A. String","B. AbstractList","C. ArrayList","D. HashMap",new int[]{2}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що таке конструктор?","A. Метод для обробки виключень","B. Метод для створення об'єкта класу","C. Модифікатор доступу","D. Інтерфейс",new int[]{2}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що відбувається при виклику System.gc()?","A. Викликається збірник сміття","B. Програма завершується","C. Звільняється вся пам'ять","D. Виконується вихід з програми",new int[]{1}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Який метод використовується для створення нового потоку?","A. run()","B. start()","C. stop()","D. sleep()",new int[]{2}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що таке throws?","A. Викидає виключення","B. Оголошує виключення","C. Ловить виключення","D. Закриває програму",new int[]{2}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Який з цих типів є примітивним?","A. String","B. Integer","C. char","D. List",new int[]{3}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що таке finally?","A. Блок, який обробляє виключення","B. Блок, який виконується завжди","C. Оголошення виключень","D. Створення змінних",new int[]{2}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Який інтерфейс використовується для колекцій?","A. Set","B. List","C. Collection","D. Map",new int[]{3}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що таке this?","A. Ключове слово для виклику конструктора","B. Посилання на поточний об'єкт класу","C. Посилання на суперклас","D. Виклик методу",new int[]{2}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що робить оператор new?","A. Оголошує змінну","B. Створює об'єкт класу","C. Викликає метод","D. Зупиняє програму",new int[]{2}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що таке пакет (package) у Java?","A. Група класів","B. Тип змінної","C. Конструктор","D. Блок виключень",new int[]{1}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Яка з цих конструкцій використовується для обробки виключень?","A. if-else","B. for","C. try-catch","D. switch",new int[]{3}));
        ListOfTests.Test.getListOfRadioButtonTest().add( new TestByTopic.RadioButtonTest(
                "Що означає ключове слово super?","A. Посилання на суперклас","B. Викликає підклас","C. Зупиняє програму","D. Оголошує клас",new int[]{1}));



        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що таке клас у Java?", "A. Тип змінної", "B. Шаблон для створення об'єктів", "C. Функція", new int[]{2}));
        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який модифікатор доступу є найбільш обмеженим?", "A. public", "B. protected", "C. private", new int[]{3}));
        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що таке інтерфейс у Java?", "A. Реалізація класу", "B. Опис методів без реалізації", "C. Тип даних", new int[]{2}));



        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Java підтримує багатопоточність?", "Правильно", "Неправильно", new int[]{1}));
        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Оператор 'throw' викидає виключення?", "Правильно", "Неправильно", new int[]{1}));
        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Клас 'String' є примітивним типом?", "Правильно", "Неправильно", new int[]{2}));



        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наведених класів належать до колекцій?", "A. ArrayList", "B. HashMap", "C. FileWriter", "D. TreeSet", "E. StringBuffer", new int[] {1, 2, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що є принципами ООП?", "A. Інкапсуляція", "B. Наслідування", "C. Поліморфізм", "D. Рекурсія", "E. Мемоізація", new int[] {1, 2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наведених модифікаторів доступу існують у Java?", "A. public", "B. private", "C. package", "D. protected", "E. global", new int[] {1, 2, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які типи виключень є перевіреними?", "A. IOException", "B. SQLException", "C. RuntimeException", "D. NullPointerException", "E. ArithmeticException", new int[] {1, 2}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які методи використовуються для багатопотоковості?", "A. run()", "B. start()", "C. print()", "D. wait()", "E. close()", new int[] {1, 2, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які типи є примітивними?", "A. int", "B. double", "C. String", "D. boolean", "E. ArrayList", new int[] {1, 2, 4}));


    }
    static public void intiateTest2(){
        // RadioButton Questions (18 питань)
        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке типи даних у Java?",
                "A. Це класи", "B. Це змінні", "C. Це способи зберігання значень", "D. Це методи", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який з наступних типів є примітивним типом в Java?",
                "A. String", "B. int", "C. ArrayList", "D. Object", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який з наступних типів є цілим числом?",
                "A. double", "B. int", "C. float", "D. char", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який тип даних використовує Java для представлення дійсних чисел?",
                "A. int", "B. boolean", "C. double", "D. char", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який з наступних типів є об'єктом?",
                "A. String", "B. int", "C. boolean", "D. double", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який з цих типів є примітивним?",
                "A. float", "B. String", "C. ArrayList", "D. Object", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка з цих структур даних є змінною довжиною?",
                "A. Array", "B. LinkedList", "C. String", "D. int", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який тип використовує Java для зберігання одиничних значень true/false?",
                "A. boolean", "B. int", "C. char", "D. String", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке тип `int` в Java?",
                "A. Примітивний тип", "B. Клас", "C. Об'єкт", "D. Структура даних", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Тип `char` використовується для зберігання?",
                "A. Символів", "B. Чисел з плаваючою точкою", "C. Цілих чисел", "D. Дійсних чисел", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке тип `double` в Java?",
                "A. Тип для цілих чисел", "B. Тип для дійсних чисел", "C. Тип для рядків", "D. Тип для символів", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який тип у Java дозволяє зберігати кілька значень одного типу?",
                "A. String", "B. ArrayList", "C. int", "D. boolean", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке тип `boolean` в Java?",
                "A. Примітивний тип", "B. Клас", "C. Об'єкт", "D. Структура даних", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Тип `long` використовується для зберігання:",
                "A. Цілих чисел", "B. Чисел з плаваючою точкою", "C. Строк", "D. Символів", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Тип `Object` є базовим для всіх типів у Java?",
                "A. Так", "B. Ні", "C. Може бути використаний тільки для класів", "D. Застосовується тільки для масивів", new int[] {1}));

// ComboBox Questions (3 питання)
        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який тип даних використовує Java для представлення цілих чисел?",
                "A. int", "B. float", "C. String", new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який тип даних використовується для представлення великих чисел у Java?",
                "A. long", "B. int", "C. short", new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який тип даних дозволяє працювати з двійковими значеннями?",
                "A. boolean", "B. int", "C. String", new int[] {1}));

// ChoiceBox Questions (3 питання)
        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи є тип даних `boolean` примітивним в Java?",
                "A. Правильно", "B. Неправильно", new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи можна використовувати тип `String` для зберігання цілих чисел?",
                "A. Правильно", "B. Неправильно", new int[] {2}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи є тип даних `char` примітивним в Java?",
                "A. Правильно", "B. Неправильно", new int[] {1}));

// CheckBox Questions (6 питань)
        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з типів даних є примітивними в Java?",
                "A. boolean", "B. int", "C. String", "D. char", "E. Object", new int[] {1, 2, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які типи даних в Java зберігають десяткові числа?",
                "A. float", "B. double", "C. int", "D. long", "E. char",new int[] {1, 2}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які типи використовуються для роботи з великими цілими числами?",
                "A. int", "B. long", "C. BigInteger", "D. double", "E. short",new int[] {2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з типів є числами з плаваючою комою?",
                "A. float", "B. double", "C. long", "D. int", "E. short",new int[] {1, 2}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які типи використовуються для роботи з текстом в Java?",
                "A. String", "B. char", "C. int", "D. Object", "E. float",new int[] {1, 2}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які типи є цілими числами в Java?",
                "A. int", "B. byte", "C. short", "D. float", "E. boolean",new int[] {1, 2, 3}));

    }
    static public void intiateTest3(){

        // RadioButton Questions (18 питань)
        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке змінні в Java?",
                "A. Це об'єкти", "B. Це місце для зберігання даних", "C. Це операції з даними", "D. Це методи", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який оператор використовує Java для присвоєння значення змінній?",
                "A. =", "B. ++", "C. --", "D. *", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який з цих операторів є арифметичним?",
                "A. &&", "B. ||", "C. +", "D. ==", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке оператор порівняння в Java?",
                "A. ==", "B. &", "C. +", "D. !=", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що відбувається, коли оператор `++` застосовується до змінної?",
                "A. Змінна збільшується на 1", "B. Змінна зменшується на 1", "C. Змінна ділиться на 2", "D. Нічого не відбувається", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке оператор `&&`?",
                "A. Оператор порівняння", "B. Логічний оператор", "C. Арифметичний оператор", "D. Оператор присвоєння", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який з цих операторів є логічним?",
                "A. &", "B. +", "C. ||", "D. ==", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке вираз у Java?",
                "A. Це оператор", "B. Це сума значень змінних", "C. Це результат обчислення за допомогою операторів", "D. Це метод", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який оператор використовується для обчислення залишку від ділення?",
                "A. +", "B. -", "C. /", "D. %", new int[] {4}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить оператор `=` в Java?",
                "A. Присвоює значення", "B. Порівнює значення", "C. Перевіряє рівність", "D. Додає значення", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить вираз `a + b` у Java?",
                "A. Додає два числа", "B. Порівнює два числа", "C. Віднімає два числа", "D. Множить два числа", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що означає вираз `a == b`?",
                "A. Перевірка рівності двох змінних", "B. Присвоєння значення змінній", "C. Множення двох змінних", "D. Порівняння змінних", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що буде результатом виразу `5 / 2`?",
                "A. 2.5", "B. 3", "C. 2", "D. 5", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить оператор `!` в Java?",
                "A. Інвертує значення логічної змінної", "B. Порівнює два значення", "C. Додає значення до змінної", "D. Множить два значення", new int[] {1}));

// ComboBox Questions (3 питання)
        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який з наступних операторів є арифметичним?",
                "A. ++", "B. &", "C. +", new int[] {3}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який оператор використовує Java для логічного порівняння?",
                "A. =", "B. &&", "C. +", new int[] {2}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який з наступних операторів присвоює значення змінній?",
                "A. +", "B. =", "C. &", new int[] {2}));

// ChoiceBox Questions (3 питання)
        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи є оператор `&&` логічним оператором в Java?",
                "A. Правильно", "B. Неправильно", new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи можна змінювати значення змінної, оголошеної як `final`?",
                "A. Так", "B. Ні", new int[] {2}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи є оператор `==` в Java оператором порівняння?",
                "A. Правильно", "B. Неправильно", new int[] {1}));

// CheckBox Questions (6 питань)
        int[] answer1 = {1, 2, 4};
        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з операторів використовуються для порівняння в Java?",
                "A. ==", "B. !=", "C. &", "D. >=", "E. +", answer1));

        int[] answer2 = {1, 2};
        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які оператори є арифметичними?",
                "A. +", "B. -", "C. *", "D. /", "E. &&", answer2));

        int[] answer3 = {1, 3};
        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які оператори є логічними в Java?",
                "A. &&", "B. +", "C. ||", "D. =", "E. %", answer3));

        int[] answer4 = {1, 3};
        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з цих операторів використовуються для обчислення залишку від ділення?",
                "A. %", "B. /", "C. *", "D. ++", "E. --", answer4));

        int[] answer5 = {2, 3};
        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з операторів є присвоєнням значення?",
                "A. ==", "B. &", "C. =", "D. +=", "E. !=", answer5));

        int[] answer6 = {1, 4, 5};
        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з операторів є інкрементами та декрементами?",
                "A. ++", "B. --", "C. +", "D. --", "E. !", answer6));

    }
    static public void intiateTest4(){
        // RadioButton Questions (18 питань)
        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке цикл в Java?",
                "A. Це операція порівняння", "B. Це повторення набору команд", "C. Це оператор присвоєння", "D. Це логічний оператор", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який оператор використовується для умовного переходу в Java?",
                "A. for", "B. if", "C. while", "D. break", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який цикл використовує умову в кінці?",
                "A. for", "B. while", "C. do-while", "D. if", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке умовний оператор в Java?",
                "A. Оператор, який дозволяє виконати певний блок коду в залежності від умови", "B. Оператор, який здійснює цикл", "C. Оператор, що порівнює змінні", "D. Оператор присвоєння", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить оператор `if` в Java?",
                "A. Виконує блок коду, якщо умова істинна", "B. Виконує цикл", "C. Присвоює значення змінній", "D. Порівнює значення змінних", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який цикл виконується мінімум один раз, незалежно від умови?",
                "A. while", "B. do-while", "C. for", "D. if", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який цикл не гарантує виконання хоча б одного разу?",
                "A. for", "B. while", "C. do-while", "D. if", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка умова у циклі `while`?",
                "A. Умова перевіряється після кожної ітерації", "B. Умова перевіряється до виконання тіла циклу", "C. Умова не перевіряється", "D. Умова визначається в середині циклу", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить оператор `break` в циклі?",
                "A. Виходить з циклу", "B. Пропускає поточну ітерацію", "C. Завершує програму", "D. Створює нескінченний цикл", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить оператор `continue` в циклі?",
                "A. Пропускає поточну ітерацію і переходить до наступної", "B. Виходить з циклу", "C. Завершує програму", "D. Створює нескінченний цикл", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке цикл `for`?",
                "A. Цикл з фіксованою кількістю ітерацій", "B. Цикл, який виконується, поки умова істинна", "C. Цикл, який виконується мінімум один раз", "D. Цикл, який використовується для порівняння значень", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке безкінечний цикл?",
                "A. Цикл, який не має умови для виходу", "B. Цикл, який виконується певну кількість разів", "C. Цикл, який виконується з умовою", "D. Цикл, який використовує оператор `break`", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить конструкція `if-else`?",
                "A. Виконує один з двох блоків коду в залежності від умови", "B. Виконує цикл", "C. Порівнює значення змінних", "D. Завершує програму", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як правильно написати цикл для 10 ітерацій?",
                "A. `for(int i = 1; i < 10; i++)`", "B. `for(int i = 0; i < 10; i++)`", "C. `while(i < 10)`", "D. `do { } while(i < 10)`", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як правильно використовувати оператор `else`?",
                "A. Після оператора `if`, коли умова хибна", "B. Після оператора `switch`", "C. Перед оператором `if`", "D. Після циклу", new int[] {1}));

// ComboBox Questions (3 питання)
        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який цикл гарантує виконання хоча б одного разу?",
                "A. while", "B. do-while", "C. for", new int[] {2}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що робить оператор `break`?",
                "A. Виходить з циклу", "B. Пропускає поточну ітерацію", "C. Завершує програму", new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який оператор використовується для умовного переходу в програмі?",
                "A. if", "B. while", "C. for", new int[] {1}));

// ChoiceBox Questions (3 питання)
        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Яка структура використовується для багаторазового виконання одного і того ж набору інструкцій?",
                "A. Умовний оператор",
                "B. Цикл",
                new int[] {2}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Що виконується, якщо умова в операторі if є хибною?",
                "A. Виконується блок else, якщо він присутній",
                "B. Програма завершується",
                new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Який цикл гарантує, що його тіло буде виконано хоча б один раз?",
                "A. while",
                "B. do-while",
                new int[] {2}));

        // CheckBox Questions (6 питань)

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з операторів використовуються для циклів в Java?",
                "A. for", "B. while", "C. switch", "D. if", "E. do-while", new int[] {1, 2}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з операторів є умовними в Java?",
                "A. if", "B. switch", "C. break", "D. while", "E. else", new int[] {1, 3, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які цикли використовуються для виконання певного набору інструкцій багато разів?",
                "A. for", "B. while", "C. do-while", "D. if", "E. switch", new int[] {1, 2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які цикли мають умову, що перевіряється до виконання тіла циклу?",
                "A. for", "B. while", "C. do-while", "D. if", "E. switch", new int[] {1, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які цикли виконуються мінімум один раз, навіть якщо умова не виконана?",
                "A. for", "B. while", "C. do-while", "D. switch", "E. if", new int[] {1, 2, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які оператори є частинами умовного конструктора в Java?",
                "A. if", "B. switch", "C. for", "D. while", "E. else", new int[] {1, 3, 5}));


    }
    static public void intiateTest5(){
        // RadioButton Questions (18 питань)
        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке клас в Java?",
                "A. Це шаблон для створення об'єктів", "B. Це змінна", "C. Це тип даних", "D. Це метод", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке об'єкт в Java?",
                "A. Це екземпляр класу", "B. Це тип даних", "C. Це змінна", "D. Це метод", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як створити об'єкт класу в Java?",
                "A. Використати оператор `new`", "B. Використати оператор `=`", "C. Використати методи класу", "D. Створити клас без конструктора", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка з наведених операцій є правильним створенням об'єкта класу?",
                "A. `MyClass obj = new MyClass();`", "B. `MyClass obj = MyClass();`", "C. `MyClass obj;`", "D. `new MyClass obj = new MyClass();`", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке конструктор класу в Java?",
                "A. Це спеціальний метод для ініціалізації об'єктів", "B. Це метод, який виконується без параметрів", "C. Це змінна, що зберігає стан об'єкта", "D. Це метод для створення нового класу", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке інкапсуляція в об'єктно-орієнтованому програмуванні?",
                "A. Обмеження доступу до деталей реалізації об'єкта", "B. Створення класу", "C. Використання спадкування", "D. Реалізація багатозадачності", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке метод класу?",
                "A. Це функція, яка визначена в класі і може бути викликана для об'єкта цього класу", "B. Це змінна, яка зберігає значення", "C. Це структура даних", "D. Це параметр конструктора", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке змінні екземпляра в класі?",
                "A. Це змінні, що зберігають значення для кожного об'єкта класу", "B. Це змінні, які мають однакове значення для всіх об'єктів класу", "C. Це методи класу", "D. Це параметри конструктора", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як називається змінна, що зберігає значення для всіх об'єктів класу?",
                "A. Змінна класу", "B. Змінна екземпляра", "C. Локальна змінна", "D. Константа", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить оператор `this` в Java?",
                "A. Вказує на поточний об'єкт", "B. Оголошує змінну класу", "C. Викликає конструктор", "D. Визначає метод класу", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке статичні методи в Java?",
                "A. Це методи, які належать класу, а не його об'єктам", "B. Це методи, що працюють тільки з об'єктами", "C. Це методи, що не приймають параметри", "D. Це методи, що повертають значення", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який з операторів використовується для доступу до членів класу з іншого класу?",
                "A. . (крапка)", "B. :: (двокрапка)", "C. -> (стрілка)", "D. [] (квадратні дужки)", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке наслідування в Java?",
                "A. Це механізм, який дозволяє одному класу успадковувати властивості та методи іншого класу", "B. Це спосіб ініціалізації об'єктів", "C. Це метод для створення класів", "D. Це метод для доступу до змінних класу", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке абстракція в Java?",
                "A. Це процес приховування складних деталей реалізації класу та показу тільки необхідного", "B. Це створення об'єктів", "C. Це визначення змінних", "D. Це визначення методів класу", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке метод зворотного виклику в Java?",
                "A. Це метод, який передається як параметр іншому методу", "B. Це метод, який викликається автоматично при створенні об'єкта", "C. Це метод, який викликається через ключове слово `this`", "D. Це метод для ініціалізації змінних", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить оператор `super` в Java?",
                "A. Викликає конструктор батьківського класу", "B. Оголошує новий клас", "C. Оголошує змінну класу", "D. Виконує метод батьківського класу", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке інтерфейс в Java?",
                "A. Це абстрактний клас, який не містить реалізації методів", "B. Це клас, що може містити тільки методи з реалізацією", "C. Це клас, який містить тільки змінні", "D. Це клас, який не можна успадковувати", new int[] {1}));

// ComboBox Questions (3 питання)
        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що таке статичні змінні в Java?",
                "A. Це змінні, які належать класу і однакові для всіх його об'єктів", "B. Це змінні, які належать кожному окремому об'єкту", "C. Це змінні, які оголошуються в методах класу", new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що таке конструктор по замовчуванню?",
                "A. Це конструктор, який автоматично створюється, якщо клас не має явного конструктора", "B. Це конструктор, що ініціалізує тільки змінні", "C. Це конструктор, що викликається вручну", new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Як називається клас, який не можна створити безпосередньо?",
                "A. Абстрактний клас", "B. Статичний клас", "C. Конкретний клас", new int[] {1}));

// ChoiceBox Questions (3 питання)
        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи можна успадковувати від класу, який містить абстрактні методи?",
                "A. Так", "B. Ні", new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Яка основна перевага інкапсуляції?",
                "A. Збереження внутрішніх даних об'єкта від змін ззовні", "B. Підвищення швидкості виконання", new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Як зробити метод або змінну доступними тільки для одного класу?",
                "A. Використовувати модифікатор доступу `private`", "B. Використовувати модифікатор доступу `public`", new int[] {1}));

// CheckBox Questions (4 питання)
        // Питання для CheckBox (6 питань)

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наступних типів даних є примітивними в Java?",
                "A. int", "B. String", "C. boolean", "D. char", "E. Object", new int[] {1, 3, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наступних класів є частиною Java Collections Framework?",
                "A. ArrayList", "B. HashMap", "C. FileWriter", "D. TreeSet", "E. StringBuffer", new int[] {1, 2, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наступних операторів є арифметичними в Java?",
                "A. +", "B. -", "C. &&", "D. *", "E. /", new int[] {1, 2, 4, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наступних модифікаторів доступу можна використовувати в Java?",
                "A. public", "B. private", "C. protected", "D. default", "E. package", new int[] {1, 2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наступних конструкцій є правильними для створення нового об'єкта?",
                "A. new ClassName();", "B. ClassName();", "C. new ClassName();", "D. ClassName obj = new ClassName();", "E. obj = new ClassName();", new int[] {1, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наступних методів використовуються для порівняння об'єктів у Java?",
                "A. equals()", "B. compareTo()", "C. toString()", "D. hashCode()", "E. compare()", new int[] {1, 2, 5}));


    }
    static public void intiateTest6(){
        // RadioButton Questions (18 питань)
        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке інкапсуляція в Java?",
                "A. Обмеження доступу до полів класу", "B. Спільний доступ до всіх класів", "C. Метод для успадкування класів", "D. Спеціальний метод для виконання операцій", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка з наступних характеристик є основною для інкапсуляції?",
                "A. Оголошення всіх методів як public", "B. Приховування даних", "C. Використання тільки конструкторів", "D. Використання тільки статичних методів", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який модифікатор доступу використовується для приховування полів класу?",
                "A. public", "B. private", "C. protected", "D. default", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Які методи використовуються для доступу до приватних полів класу?",
                "A. Getter та Setter", "B. Оператор доступу", "C. Спеціальні конструкції", "D. Конструктори", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке getter метод?",
                "A. Метод, що встановлює значення змінної", "B. Метод, що отримує значення змінної", "C. Метод, що змінює стан об'єкта", "D. Метод для виключення помилок", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Які поля можна зробити приватними в Java?",
                "A. Лише примітивні", "B. Лише об'єктні", "C. Будь-які поля", "D. Лише статичні", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке інкапсуляція?",
                "A. Структурування даних у класах", "B. Приховування деталей реалізації", "C. Спільний доступ до класів", "D. Використання тільки фінальних змінних", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що є результатом використання інкапсуляції в програмуванні?",
                "A. Покращення продуктивності", "B. Покращення безпеки даних", "C. Зменшення кількості методів", "D. Спрощення коду", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Якщо поле є приватним, яким чином до нього можна звернутися?",
                "A. Використовуючи прямий доступ", "B. Використовуючи getter та setter методи", "C. За допомогою конструктора", "D. Програмно через умовні оператори", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка мета використання setter методів?",
                "A. Доступ до приватних змінних", "B. Встановлення значення для змінної", "C. Перевірка значення змінної", "D. Виконання операцій з класом", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке private поля в класі?",
                "A. Поля, доступні лише в межах цього класу", "B. Поля, доступні в межах пакету", "C. Поля, доступні для всіх класів", "D. Поля, доступні лише для дочірніх класів", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке public поля в класі?",
                "A. Поля, доступні тільки в межах класу", "B. Поля, доступні в межах пакету", "C. Поля, доступні для всіх класів", "D. Поля, доступні лише для статичних методів", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як можна змінити значення поля класу, що має модифікатор private?",
                "A. За допомогою конструктора", "B. За допомогою getter та setter методів", "C. За допомогою прямого доступу", "D. За допомогою рефлексії", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яким чином можна забезпечити захист даних за допомогою інкапсуляції?",
                "A. Використовувати приватні поля та публічні методи для доступу", "B. Оголосити всі методи класу як private", "C. Використовувати лише статичні змінні", "D. Використовувати лише final змінні", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке інтерфейси в контексті інкапсуляції?",
                "A. Інтерфейси дозволяють встановлювати доступ до приватних змінних", "B. Інтерфейси визначають, які методи повинні бути доступними ззовні", "C. Інтерфейси містять лише конструктори", "D. Інтерфейси є специфікацією лише для getter методів", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке абстракція в порівнянні з інкапсуляцією?",
                "A. Абстракція приховує деталі реалізації, а інкапсуляція обмежує доступ до них", "B. Абстракція дозволяє доступ до всіх полів, а інкапсуляція їх обмежує", "C. Абстракція визначає класи, а інкапсуляція — лише методи", "D. Абстракція використовується для спрощення коду", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке клас в Java?",
                "A. Це шаблон для створення об'єктів", "B. Це метод для виконання операцій", "C. Це функція для виконання задач", "D. Це окрема програма", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яким чином інкапсуляція допомагає при багатозадачності?",
                "A. Вона дозволяє використовувати спільний доступ до змінних", "B. Вона дає можливість змішувати дані між різними потоками", "C. Вона забезпечує незалежність даних між потоками", "D. Вона дозволяє змінювати порядок виконання задач", new int[] {3}));

        // ComboBox Questions (3 питання)
        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Яка основна мета інкапсуляції в Java?",
                "A. Збільшити швидкість виконання програми", "B. Покращити безпеку та організацію даних", "C. Знизити споживання пам'яті", new int[] {2}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який модифікатор доступу дозволяє доступ лише з того ж пакету?",
                "A. private", "B. default", "C. protected", new int[] {2}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що таке setter метод?",
                "A. Метод для отримання значення змінної", "B. Метод для встановлення значення змінної", "C. Метод для перевірки значення змінної", new int[] {2}));


// ChoiceBox Questions (3 питання)
        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Інкапсуляція дозволяє приховати дані класу. Це правильно?",
                "A. Правильно", "B. Неправильно", new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Інкапсуляція дозволяє полям бути доступними без обмежень. Це правильно?",
                "A. Правильно", "B. Неправильно", new int[] {2}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Setter методи можуть змінювати значення полів класу. Це правильно?",
                "A. Правильно", "B. Неправильно", new int[] {1}));


// CheckBox Questions (6 питань)
        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наведених модифікаторів доступу можуть бути використані для інкапсуляції?",
                "A. public", "B. private", "C. protected", "D. default", "E. static", new int[] {1, 2}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які методи є частиною інкапсуляції?",
                "A. Static методи", "B. Getter методи", "C. Setter методи", "D. Методи доступу", "E. Конструктори", new int[] {2, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наступних змінних можуть бути приховані за допомогою інкапсуляції?",
                "A. public", "B. private", "C. protected", "D. статичні змінні", "E. фінальні змінні", new int[] {1, 3, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наступних методів використовуються для доступу до приватних змінних?",
                "A. Getter", "B. Setter", "C. Finalizer", "D. Constructor", "E. Accessor", new int[] {1, 2, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наступних полів є приватними?",
                "A. приватні поля", "B. захищені поля", "C. публічні поля", "D. статичні поля", "E. фінальні поля", new int[] {1, 2}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які методи зазвичай є публічними для доступу до приватних змінних?",
                "A. Getter", "B. Setter", "C. Private", "D. Constructor", "E. Protected", new int[] {1, 3, 4}));
    }
    static public void intiateTest7(){
        // RadioButton Questions (18 питань)
        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке наслідування в Java?",
                "A. Способи змінювати значення змінних", "B. Спадкування властивостей і методів від батьківського класу", "C. Процес створення нових класів без класів-батьків", "D. Використання лише статичних методів", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який ключовий слово використовується для наслідування класу в Java?",
                "A. extends", "B. inherit", "C. implements", "D. super", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Які методи можна успадкувати від батьківського класу?",
                "A. Лише статичні методи", "B. Тільки публічні та захищені методи", "C. Лише приватні методи", "D. Тільки методи з однаковими іменами", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке клас-нащадок?",
                "A. Клас, який успадковує властивості і методи від іншого класу", "B. Клас, який є основою для створення об'єктів", "C. Клас, який виконує всі методи без спадкування", "D. Клас, який не має полів", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яким чином клас-нащадок може використовувати методи батьківського класу?",
                "A. Через виклик конструктора", "B. Прямим доступом до полів батьківського класу", "C. Використовуючи ключове слово super", "D. Виключно через статичні методи", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Які модифікатори доступу можна використовувати для методів, що успадковані від батьківського класу?",
                "A. public, protected", "B. private, default", "C. тільки public", "D. private, protected", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як можна викликати метод батьківського класу з класу-нащадка?",
                "A. За допомогою ключового слова this", "B. За допомогою ключового слова super", "C. За допомогою ключового слова new", "D. Прямим доступом через ім'я класу", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Чи можна створити об'єкт батьківського класу, якщо клас є абстрактним?",
                "A. Так, об'єкти можна створювати", "B. Ні, об'єкти не можна створювати", "C. Тільки через виклик конструктора", "D. Об'єкти можна створювати тільки для абстрактних методів", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке метод, який перевизначає метод батьківського класу?",
                "A. Оверлоадинг", "B. Оверрайдинг", "C. Абстракція", "D. Інкапсуляція", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Які об'єкти можуть бути створені при успадкуванні в Java?",
                "A. Лише об'єкти батьківського класу", "B. Тільки об'єкти класу-нащадка", "C. Об'єкти як батьківського класу, так і нащадка", "D. Об'єкти класів-нащадків для кожного батьківського класу", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке перевизначення методу (Overriding)?",
                "A. Метод, який викликається перед виконанням основного методу", "B. Метод, який змінює поведінку методу батьківського класу", "C. Метод, який визначає новий клас", "D. Метод, який змінює змінні класу", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що відбувається при використанні ключового слова super()?",
                "A. Викликається метод класу-нащадка", "B. Викликається метод батьківського класу", "C. Створюється новий клас", "D. Оголошується новий конструктор", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як називається процес наслідування лише деяких методів класу?",
                "A. Поліморфізм", "B. Часткове наслідування", "C. Абстракція", "D. Компонування", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Чи можна успадковувати конструктори в Java?",
                "A. Так", "B. Ні", "C. Лише статичні конструктори", "D. Лише конструктори з параметрами", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке батьківський клас в контексті успадкування?",
                "A. Клас, який успадковує властивості від нащадка", "B. Клас, який не має методів", "C. Клас, від якого успадковуються властивості та методи", "D. Клас, який виконує лише одну функцію", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як визначити, що метод є перевизначенням батьківського класу?",
                "A. За допомогою ключового слова static", "B. За допомогою ключового слова final", "C. За допомогою ключового слова override", "D. За допомогою ключового слова new", new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Чи можна наслідувати приватні методи?",
                "A. Так", "B. Ні", "C. Лише для класів-потомків", "D. Лише для абстрактних класів", new int[] {2}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що таке наслідування в контексті об'єктно-орієнтованого програмування?",
                "A. Створення нового класу без базового класу",
                "B. Копіювання властивостей між класами",
                "C. Спадкування властивостей та методів одного класу іншими класами",
                new int[] {3}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що означає ключове слово `super` в Java?",
                "A. Викликає конструктор батьківського класу",
                "B. Викликає конструктор нащадка",
                "C. Використовується для створення нових класів",
                new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що таке перевизначення методу (overriding)?",
                "A. Метод нащадка, який має таку саму сигнатуру, як і метод батьківського класу",
                "B. Метод, який викликається після конструктора",
                "C. Спеціальний метод для створення об'єктів",
                new int[] {1}));


        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи можна успадковувати конструктори в Java?",
                "A. Так",
                "B. Ні",
                new int[] {2}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Що відбувається, коли клас-нащадок викликає метод батьківського класу через `super`?",
                "A. Метод батьківського класу виконується",
                "B. Метод нащадка перевизначається",
                new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи можна змінити значення полів батьківського класу без використання методу?",
                "A. Так, якщо поле має модифікатор доступу `public`",
                "B. Ні, всі поля є приватними",
                new int[] {1}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з методів є перевизначеними (overridden)?",
                "A. Метод, який змінює поведінку батьківського класу",
                "B. Метод, який визначає новий клас",
                "C. Метод, який викликає методи об'єкта",
                "D. Метод, який викликає конструктор класу",
                "E. Метод, який створює новий клас", new int[] {1, 3, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які класи можуть бути батьківськими в Java?",
                "A. Тільки абстрактні класи",
                "B. Тільки інтерфейси",
                "C. Класи, які успадковують методи інших класів",
                "D. Класи, які мають конструктора",
                "E. Класи, які не можуть бути батьківськими", new int[] {1, 2, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які властивості успадковуються від батьківського класу?",
                "A. Поля класу",
                "B. Конструктори",
                "C. Методи",
                "D. Лише статичні методи",
                "E. Лише публічні методи", new int[] {1, 2, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які модифікатори доступу дозволяють успадковувати методи?",
                "A. public",
                "B. protected",
                "C. private",
                "D. default",
                "E. final", new int[] {1, 3, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які класи можуть успадковувати методи від батьківського класу?",
                "A. Тільки класи-нащадки",
                "B. Класи, які мають однакові імена з батьківським",
                "C. Класи, що реалізують інтерфейси",
                "D. Абстрактні класи",
                "E. Статичні класи", new int[] {1, 2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з операцій можна виконати на успадкованих методах?",
                "A. Виклик методів",
                "B. Перевизначення методів",
                "C. Оверлоадинг методів",
                "D. Виключення методів",
                "E. Використання тільки з об'єктами класу-нащадка", new int[] {1, 2, 4}));

    }
    static public void intiateTest8(){
        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке поліморфізм в ООП?",
                "A. Кілька класів, що мають однакові методи",
                "B. Спосіб виклику методів на різних об'єктах",
                "C. Опис процесу успадкування",
                "D. Визначення класу за допомогою інтерфейсу", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як поліморфізм допомагає у програмуванні?",
                "A. Підвищує швидкість роботи програми",
                "B. Дозволяє одному методу працювати з різними типами даних",
                "C. Збільшує розмір програми",
                "D. Створює нові об'єкти під час виконання програми", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке перевантаження методу (overloading)?",
                "A. Створення нового методу з такою ж сигнатурою",
                "B. Метод з іншою сигнатурою в тому ж класі",
                "C. Перевизначення методу батьківського класу",
                "D. Видалення методу з класу", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке перевизначення методу (overriding)?",
                "A. Метод нащадка має таку ж сигнатуру, як і у батьківському класі",
                "B. Створення нового методу в батьківському класі",
                "C. Перевизначення полів батьківського класу",
                "D. Використання конструктора для зміни методу", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як визначити поліморфізм у Java?",
                "A. Через використання абстрактних класів",
                "B. Завдяки можливості одного методу працювати з різними об'єктами",
                "C. Через інтерфейси",
                "D. Використовуючи ключове слово `super`", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке абстракція в ООП?",
                "A. Приховування реалізації методів класу",
                "B. Об'єднання подібних класів у один",
                "C. Створення нових класів",
                "D. Використання поліморфізму", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як поліморфізм використовує інтерфейси?",
                "A. Через перевизначення методів інтерфейсу в класах-нащадках",
                "B. Через створення нових інтерфейсів",
                "C. Через встановлення значення полів в інтерфейсі",
                "D. Через визначення приватних полів інтерфейсу", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Які модифікатори доступу дозволяють перевизначати методи?",
                "A. private",
                "B. protected",
                "C. public",
                "D. final", new int[] {2, 3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який клас в Java є базовим для всіх класів?",
                "A. Object",
                "B. BaseClass",
                "C. Parent",
                "D. Root", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що означає ключове слово `super`?",
                "A. Викликає конструктор батьківського класу",
                "B. Створює новий об'єкт",
                "C. Використовується для доступу до методів нащадка",
                "D. Підвищує пріоритет методів", new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке динамічний поліморфізм?",
                "A. Поліморфізм, що використовується при виклику статичних методів",
                "B. Поліморфізм, що використовується при виклику методів під час виконання програми",
                "C. Поліморфізм, що використовує перевантаження методів",
                "D. Поліморфізм через доступ до приватних методів", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який тип поліморфізму підтримує Java?",
                "A. Динамічний поліморфізм",
                "B. Статичний поліморфізм",
                "C. Поліморфізм за допомогою інтерфейсів",
                "D. Все вищезазначене", new int[] {4}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Чи підтримує Java поліморфізм при роботі з примітивними типами даних?",
                "A. Так",
                "B. Ні",
                "C. Тільки для типів `int` і `boolean`",
                "D. Тільки для класів", new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Які з перерахованих методів не підтримують поліморфізм?",
                "A. Статичні методи",
                "B. Конструктори",
                "C. Абстрактні методи",
                "D. Методи інтерфейсів", new int[] {1, 2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Чому поліморфізм є важливим для ООП?",
                "A. Дозволяє зменшити кількість коду",
                "B. Забезпечує більше контролю над пам'яттю",
                "C. Дозволяє об'єднувати різні класи з однаковими методами",
                "D. Спрощує використання базових класів", new int[] {3}));


        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що таке поліморфізм в ООП?",
                "A. Спадкування властивостей і методів",
                "B. Кілька форм одного методу",
                "C. Створення нових класів",
                new int[] {2}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що таке перевизначення методу в Java?",
                "A. Заміна методу батьківського класу в нащадку",
                "B. Створення нового методу",
                "C. Переіменування методу",
                new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Яка властивість поліморфізму дозволяє змінювати поведінку методів?",
                "A. Ключове слово `super`",
                "B. Перевизначення методів",
                "C. Використання інтерфейсів",
                new int[] {2}));




        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Що таке поліморфізм в Java?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи підтримує Java статичний поліморфізм?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи може Java здійснювати поліморфізм з інтерфейсами?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {1}));



        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з перерахованих є способами поліморфізму?",
                "A. Перевизначення методів",
                "B. Перевантаження методів",
                "C. Спадкування",
                "D. Оголошення класів",
                "E. Використання інтерфейсів",
                new int[] {1, 2, 3, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які методи в Java підтримують поліморфізм?",
                "A. Статичні методи",
                "B. Інтерфейсні методи",
                "C. Абстрактні методи",
                "D. Конструктори",
                "E. Метод `toString`",
                new int[] {2, 3, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з наведених є прикладами перевантаження методів?",
                "A. Використання різних типів параметрів",
                "B. Використання однакових параметрів",
                "C. Модифікація сигнатури методу",
                "D. Використання методів з різними іменами",
                "E. Зміна поведінки методу через `super`",
                new int[] {1, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що дозволяє поліморфізм?",
                "A. Виконувати різні операції з однаковими методами",
                "B. Оновлювати значення класів",
                "C. Створювати нові методи в класах-нащадках",
                "D. Використовувати базові класи без змін",
                "E. Покращує ефективність програми",
                new int[] {1, 3, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Як працює динамічний поліморфізм?",
                "A. Поліморфізм виконується під час компіляції",
                "B. Поліморфізм виконується під час виконання програми",
                "C. Поліморфізм залежить від того, який метод викликається",
                "D. Поліморфізм залежить від інтерфейсу",
                "E. Поліморфізм підтримується тільки через абстракцію",
                new int[] {2, 3, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що таке абстрактний клас?",
                "A. Клас, що може містити абстрактні методи",
                "B. Клас, що не може мати конструктори",
                "C. Клас, що не можна використовувати для створення об'єктів",
                "D. Клас, який не має конкретної реалізації",
                "E. Клас з певними методами",
                new int[] {1, 3, 4}));

    }
    static public void intiateTest9(){

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке абстракція в програмуванні?",
                "A. Створення нових класів на основі старих",
                "B. Приховування складних деталей реалізації",
                "C. Перевизначення методів",
                "D. Описання об'єктів без конкретних методів",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що означає абстракція в ООП?",
                "A. Видалення класів",
                "B. Приховування складності і збереження тільки важливих деталей",
                "C. Наслідування властивостей",
                "D. Описання нових методів",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка головна мета абстракції?",
                "A. Зменшення обсягу коду",
                "B. Приховування внутрішніх деталей реалізації",
                "C. Підвищення швидкості виконання програми",
                "D. Розширення класів",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Чи може абстрактний клас містити конкретні методи?",
                "A. Ні, тільки абстрактні методи",
                "B. Так, абстрактні методи не обов'язкові",
                "C. Так, абстрактні методи обов'язкові",
                "D. Ні, абстрактний клас не може містити жодних методів",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що є характерним для абстрактного класу?",
                "A. Він не може мати конструкторів",
                "B. Він може мати абстрактні та конкретні методи",
                "C. Він не може бути успадкований",
                "D. Він завжди має лише абстрактні методи",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Які методи можуть бути абстрактними?",
                "A. Лише методи, що містять реалізацію",
                "B. Лише методи, що не мають реалізації",
                "C. Лише методи класів-нащадків",
                "D. Абстрактні методи не існують",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що означає абстракція при роботі з інтерфейсами?",
                "A. Створення нових класів на основі існуючих",
                "B. Сховати конкретну реалізацію і визначити лише сигнатуру методу",
                "C. Визначити конструкції, які мають лише конкретну реалізацію",
                "D. Описати лише змінні, але без методів",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що є абстрактним методом?",
                "A. Метод, який містить реалізацію",
                "B. Метод, який має лише сигнатуру і не має тіла",
                "C. Метод, що викликається автоматично",
                "D. Метод, що використовується лише в абстрактних класах",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке інтерфейс в Java?",
                "A. Абстрактний клас, який не має жодної реалізації",
                "B. Клас, що містить лише методи без тіла",
                "C. Клас, що визначає лише структуру даних",
                "D. Клас, що може містити лише змінні",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що можна реалізувати за допомогою абстракції?",
                "A. Повторне використання коду",
                "B. Приховування деталей реалізації",
                "C. Підвищення швидкості роботи програми",
                "D. Опис нових змінних",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке абстрактний клас?",
                "A. Клас, що містить лише абстрактні методи",
                "B. Клас, який не можна успадкувати",
                "C. Клас, який містить реалізовані та нереалізовані методи",
                "D. Клас без змінних",
                new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який з цих класів є абстрактним?",
                "A. ArrayList",
                "B. AbstractList",
                "C. String",
                "D. File",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що не є абстракцією?",
                "A. Опис даних без реалізації методів",
                "B. Використання інтерфейсів для опису методів",
                "C. Визначення класів з конкретними методами",
                "D. Приховування складності реалізації",
                new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що дозволяє абстракція?",
                "A. Підвищити продуктивність коду",
                "B. Зменшити складність програми",
                "C. Покращити структуру програми",
                "D. Перевизначити всі методи",
                new int[] {2}));



        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яке основне призначення інтерфейсів в Java?",
                "A. Описувати структуру, не надаючи реалізації",
                "B. Визначати методи, які не можна перевизначити",
                "C. Реалізувати конкретні методи",
                "D. Систематизувати код",
                new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи може абстрактний клас мати статичні методи?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи можна створювати екземпляри класу, який є інтерфейсом?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {2}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи може клас реалізувати більше ніж один інтерфейс?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який тип методу не може бути абстрактним?",
                "A. Метод з конкретною реалізацією",
                "B. Метод без реалізації",
                "C. Метод з сигнатурою",
                new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що містить абстрактний клас?",
                "A. Лише абстрактні методи",
                "B. Тільки конкретні методи",
                "C. Як абстрактні, так і конкретні методи",
                new int[] {3}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що відрізняє абстрактний клас від інтерфейсу?",
                "A. Абстрактний клас може містити конкретні методи",
                "B. Інтерфейс містить лише абстрактні методи",
                "C. Інтерфейс не може мати змінних",
                new int[] {1}));


        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що є типовими характеристиками абстракції?",
                "A. Приховування деталей реалізації",
                "B. Визначення лише важливих аспектів",
                "C. Використання інтерфейсів",
                "D. Зменшення обсягу коду",
                "E. Створення конкретних класів",
                new int[] {1, 2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що є важливими аспектами абстракції?",
                "A. Сховати подробиці реалізації",
                "B. Визначати лише ключові функціональності",
                "C. Створення конкретних класів",
                "D. Забезпечення ефективного доступу до змінних",
                "E. Усі варіанти правильні",
                new int[] {1, 2}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що вважається абстракцією в програмуванні?",
                "A. Створення абстрактних класів",
                "B. Приховування складності реалізації",
                "C. Визначення інтерфейсів",
                "D. Використання перевизначення методів",
                "E. Створення об'єктів класу",
                new int[] {1, 2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що може бути ознакою поганої абстракції?",
                "A. Велика кількість абстрактних класів",
                "B. Невизначеність в інтерфейсах",
                "C. Висока складність коду",
                "D. Наявність дублювання коду",
                "E. Усі варіанти правильні",
                new int[] {2, 3, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що може бути позитивним в абстракції?",
                "A. Зниження складності коду",
                "B. Покращення структури програми",
                "C. Покращення тестування програм",
                "D. Підвищення розуміння програмою",
                "E. Усі варіанти правильні",
                new int[] {1, 2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що є перевагою абстракції?",
                "A. Зниження складності програми",
                "B. Забезпечення гнучкості програми",
                "C. Підвищення безпеки програми",
                "D. Додавання нових можливостей",
                "E. Усі варіанти правильні",
                new int[] {1, 2}));


    }
    static public void intiateTest10(){

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який інтерфейс використовує клас ArrayList?",
                "A. List",
                "B. Set",
                "C. Map",
                "D. Queue",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка особливість Set в Java?",
                "A. Може містити повторювані елементи",
                "B. Не містить повторювані елементи",
                "C. Має індексацію елементів",
                "D. Може бути відсортованим",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке Map в Java?",
                "A. Колекція пар ключ-значення",
                "B. Колекція з унікальними елементами",
                "C. Лінійна структура даних",
                "D. Стек даних",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який інтерфейс використовує клас HashMap?",
                "A. Set",
                "B. Map",
                "C. List",
                "D. Queue",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як додаються елементи до List?",
                "A. Використовуючи метод add()",
                "B. Використовуючи метод put()",
                "C. Використовуючи метод addAll()",
                "D. Використовуючи метод addFirst()",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який метод застосовується для перевірки наявності елементу в Set?",
                "A. contains()",
                "B. containsKey()",
                "C. find()",
                "D. exists()",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка колекція зберігає елементи у вигляді пар ключ-значення?",
                "A. List",
                "B. Set",
                "C. Map",
                "D. Queue",
                new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що є характерною рисою LinkedList?",
                "A. Швидкий доступ до елементів за індексом",
                "B. Динамічне збільшення пам'яті при додаванні елементів",
                "C. Забезпечує швидке додавання і видалення елементів з обох кінців",
                "D. Підтримка впорядкованості елементів",
                new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке TreeSet?",
                "A. Структура даних, що забезпечує сортування елементів",
                "B. Множина без сортування елементів",
                "C. Списки з унікальними елементами",
                "D. Спеціалізований тип для зберігання пар ключ-значення",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке HashMap?",
                "A. Колекція, що забезпечує швидкий доступ до елементів по ключу",
                "B. Колекція для зберігання відсортованих елементів",
                "C. Колекція для зберігання списку елементів",
                "D. Колекція, яка не дозволяє мати порожні елементи",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка з колекцій є упорядкованою?",
                "A. Set",
                "B. TreeSet",
                "C. HashSet",
                "D. LinkedHashSet",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як додати елемент до Map?",
                "A. put()",
                "B. add()",
                "C. insert()",
                "D. addItem()",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке HashSet?",
                "A. Колекція, яка дозволяє зберігати унікальні елементи",
                "B. Колекція, яка дозволяє повторювані елементи",
                "C. Колекція для зберігання пар ключ-значення",
                "D. Колекція, що підтримує індексацію",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що є ключем у Map?",
                "A. Значення",
                "B. Пара ключ-значення",
                "C. Тільки ключі",
                "D. Тільки значення",
                new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як можна видалити елемент з HashMap?",
                "A. remove()",
                "B. delete()",
                "C. removeAt()",
                "D. pop()",
                new int[] {1}));


        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який тип колекції використовує клас HashMap?",
                "A. List",
                "B. Set",
                "C. Map",
                new int[] {3}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Як працює метод add() у List?",
                "A. Додає елемент у кінець списку",
                "B. Додає елемент в початок списку",
                "C. Вставляє елемент в середину списку",
                new int[] {1}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Яка колекція гарантує порядок елементів?",
                "A. LinkedHashSet",
                "B. HashSet",
                "C. TreeSet",
                new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи може List містити повторювані елементи?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи зберігає HashSet порядок елементів?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {2}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи можна використовувати List для зберігання унікальних елементів?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {2}));


        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що може бути елементами в Set?",
                "A. Унікальні елементи",
                "B. Повторювані елементи",
                "C. Ключі та значення",
                "D. Тільки числові значення",
                "E. Тільки об'єкти",
                new int[] {1, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які характеристики має HashMap?",
                "A. Зберігає пари ключ-значення",
                "B. Підтримує впорядкованість елементів",
                "C. Швидкий доступ по ключу",
                "D. Забезпечує доступ за індексом",
                "E. Підтримує лише унікальні ключі",
                new int[] {1, 3, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що підтримує LinkedList?",
                "A. Швидке додавання елементів з обох кінців",
                "B. Індексований доступ до елементів",
                "C. Упорядкованість елементів",
                "D. Повторювані елементи",
                "E. Використовує зв'язки для елементів",
                new int[] {1, 3, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що є основною особливістю TreeSet?",
                "A. Сортування елементів",
                "B. Дозволяє повторювані елементи",
                "C. Забезпечує доступ за індексом",
                "D. Використовує хешування для зберігання елементів",
                "E. Вміщує лише унікальні елементи",
                new int[] {1, 5}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що відноситься до характеристик Map?",
                "A. Зберігає пари ключ-значення",
                "B. Не гарантує порядок елементів",
                "C. Дозволяє мати тільки унікальні ключі",
                "D. Дозволяє мати тільки унікальні значення",
                "E. Підтримує доступ за індексом",
                new int[] {1, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які операції підтримує HashSet?",
                "A. Додавання елементів",
                "B. Видалення елементів",
                "C. Індексований доступ",
                "D. Перевірка наявності елементу",
                "E. Сортування елементів",
                new int[] {1, 2, 4}));

    }
    static public void intiateTest11(){
        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке блок try-catch в Java?",
                "A. Блок для обробки виключень",
                "B. Блок для обробки введення-виведення",
                "C. Блок для створення об'єктів",
                "D. Блок для обробки математичних операцій",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який тип виключень обробляється за допомогою try-catch?",
                "A. Тільки перевірені виключення",
                "B. Тільки неперевірені виключення",
                "C. Перевірені та неперевірені виключення",
                "D. Тільки виключення, які виникають у методах",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який тип блоку використовується для обробки виключень?",
                "A. try",
                "B. catch",
                "C. finally",
                "D. switch",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Який блок виконується завжди після завершення блоку try-catch?",
                "A. try",
                "B. catch",
                "C. finally",
                "D. break",
                new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як виконується код, що міститься в блоці catch?",
                "A. Тільки якщо виникло виключення",
                "B. Якщо код блоку try виконано успішно",
                "C. Завжди, незалежно від помилок",
                "D. Якщо не знайдено відповідних класів виключень",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Якщо в блоці try не виникає виключення, то блок catch буде виконано?",
                "A. Так",
                "B. Ні",
                "C. Залежить від типу виключення",
                "D. Тільки для неперевірених виключень",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що можна обробляти в блоці catch?",
                "A. Лише типи виключень, що зазначені у сигнатурі методу",
                "B. Тільки неперевірені виключення",
                "C. Виключення, які успадковують клас Throwable",
                "D. Виключення, що виникають в процесі компіляції",
                new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Яка з цих конструкцій є правильною для обробки виключення?",
                "A. try { ... } catch(Exception e) { ... }",
                "B. try { ... } catch { ... }",
                "C. try { ... } except { ... }",
                "D. try { ... } except(Exception e) { ... }",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що робить ключове слово throw?",
                "A. Створює нове виключення",
                "B. Завершує програму",
                "C. Оголошує виключення",
                "D. Обробляє виключення",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як обробити кілька типів виключень у одному блоці catch?",
                "A. Використовувати оператор OR",
                "B. Використовувати окремі блоки catch для кожного типу",
                "C. Використовувати багатократний параметр у catch",
                "D. Java не підтримує це",
                new int[] {3}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що таке перевірене виключення?",
                "A. Виключення, яке потрібно явно обробляти або передавати",
                "B. Виключення, яке може бути передане в конструкторі",
                "C. Виключення, яке виникає тільки під час виконання програми",
                "D. Виключення, яке не можна обробити в блоках catch",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як можна створити власне виключення?",
                "A. Потрібно успадкувати клас Exception",
                "B. Потрібно використовувати стандартні виключення",
                "C. Використовувати only error() method",
                "D. Створити метод catch()",
                new int[] {1}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Які блоки можуть містити виключення?",
                "A. Лише блок try",
                "B. Блоки try, catch, finally",
                "C. Лише блок catch",
                "D. Лише блок finally",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Що відбудеться, якщо виключення не буде оброблено?",
                "A. Програма продовжить виконання",
                "B. Програма припинить виконання",
                "C. Виключення буде автоматично збережено",
                "D. Програма виведе повідомлення про помилку",
                new int[] {2}));

        ListOfTests.Test.getListOfRadioButtonTest().add(new TestByTopic.RadioButtonTest(
                "Як зупинити виконання програми при виникненні виключення?",
                "A. Використовувати метод exit()",
                "B. Використовувати throw",
                "C. Використовувати break",
                "D. Використовувати return",
                new int[] {1}));


        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Який блок виконується після блоку try, навіть якщо виключення не виникло?",
                "A. catch",
                "B. throw",
                "C. finally",
                new int[] {3}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що обробляє блок catch?",
                "A. Тільки стандартні виключення",
                "B. Тільки неперевірені виключення",
                "C. Виключення, що виникають в блоці try",
                new int[] {3}));

        ListOfTests.Test.getListOfComboBoxTest().add(new TestByTopic.ComboBoxTest(
                "Що дозволяє зробити блок try-catch?",
                "A. Обробляти виключення",
                "B. Генерувати виключення",
                "C. Завершити програму",
                new int[] {1}));


        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи можна використовувати блок try-catch для обробки всіх виключень?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {2}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Що є необхідним для використання try-catch?",
                "A. Виключення повинні бути визначені",
                "B. Виключення повинні бути перехоплені",
                new int[] {1}));

        ListOfTests.Test.getListOfChoiceBoxTest().add(new TestByTopic.ChoiceBoxTest(
                "Чи є finally блок обов'язковим у try-catch?",
                "A. Правильно",
                "B. Неправильно",
                new int[] {2}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які блоки можуть містити виключення?",
                "A. try",
                "B. catch",
                "C. finally",
                "D. switch",
                "E. break",
                new int[] {1, 2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які операції можна виконувати з виключеннями?",
                "A. Лише в блоці catch",
                "B. Обробляти виключення в блоці try",
                "C. Генерувати виключення за допомогою throw",
                "D. Використовувати finally для виконання коду після виключення",
                "E. Виключення не можна обробляти в Java",
                new int[] {1, 2, 3, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що таке неперевірені виключення?",
                "A. Виключення, які потрібно обробляти",
                "B. Виключення, що виникають тільки під час виконання програми",
                "C. Виключення, що не потребують обробки",
                "D. Виключення, які можуть виникати при компіляції",
                "E. Всі виключення в Java є перевіреними",
                new int[] {2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Які з цих виключень є стандартними в Java?",
                "A. NullPointerException",
                "B. IOException",
                "C. ArithmeticException",
                "D. FileNotFoundException",
                "E. OutOfMemoryError",
                new int[] {1, 2, 3}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що можна робити в блоці finally?",
                "A. Виконувати очищення ресурсів",
                "B. Закрити файли",
                "C. Повернути значення з методу",
                "D. Скинути з'єднання з базою даних",
                "E. Завершити програму",
                new int[] {1, 2, 4}));

        ListOfTests.Test.getListOfCheckBoxTest().add(new TestByTopic.CheckBoxTest(
                "Що може відбутися, якщо виключення не буде оброблено?",
                "A. Програма продовжить виконання",
                "B. Програма припинить виконання",
                "C. Код продовжить виконання після блоку catch",
                "D. Буде виведено повідомлення про помилку",
                "E. Всі блоки виконуватимуться після виключення",
                new int[] {1, 2, 3}));

    }
}
