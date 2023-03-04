public class Gryffindor extends hogwarts {
    //Грифиндор

    protected int nobility;
    //благородство
    protected int honor;
    //честь
    protected int bravery;
    //храбрость

    public Gryffindor(String fullNameStudent, int powerOfMagic, int distanceOfTheTransgression, int nobility, int honor, int bravery) {
        super(fullNameStudent, powerOfMagic, distanceOfTheTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public String printAllInformationOfStudents() {
        return "hogwarts{" +
                "fullNameStudent='" + fullNameStudent + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTheTransgression=" + distanceOfTheTransgression +
                '}';

    }
}
/*
Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
Всем Гриффиндорцам присущи благородство, честь и храбрость.
Студенты Пуффендуя трудолюбивы, верны, честны.
Когтевранцы умны, мудры, остроумны и полны творчества.
Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте.
Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
 На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
 Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов.
 В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве объектов.
 Должна быть возможность задавать качества учеников через конструктор. Присвойте каждому свойству произвольное числовое значение от 0 до 100.
 Сделайте метод, который выводит на экран описание студента.
 В описание надо включать качества, которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.
 Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам.
 У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
 Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
 Метод должен выводить в консоль сравнение учеников.
Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов. У Рона Уизли благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.
У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти.
Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”.
 Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.
 Важно: поля объектов должны быть приватными.*/