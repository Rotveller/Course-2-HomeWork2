import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        GryffindorStudents garryPotter = new GryffindorStudents("Гарри Поттер", 10, 8, 100, 95, 100);
        GryffindorStudents germionaGrandger = new GryffindorStudents("Гермиона Грейнджер", 8, 10, 80, 89, 79);
        GryffindorStudents ronYizly = new GryffindorStudents("Рон Уизли", 6, 5, 75, 50, 59);
        //
        HufflepuffStudents zachariahSmith = new HufflepuffStudents("Захария Смит", 6, 5, 75, 50, 59);
        HufflepuffStudents cedricDiggory = new HufflepuffStudents(" Седрик Диггори", 6, 5, 75, 50, 59);
        HufflepuffStudents justinFinchFletchley = new HufflepuffStudents("Джастин Финч-Флетчли", 6, 5, 75, 50, 59);
        //
        RavenclawStudents zhouChang = new RavenclawStudents("Чжоу Чанг", 6, 5, 75, 50, 59, 45);
        RavenclawStudents padmaPatil = new RavenclawStudents("Падма Патил", 6, 5, 75, 50, 75, 50);
        RavenclawStudents marcusBelby = new RavenclawStudents("Маркус Белби", 6, 5, 75, 50, 94, 51);
        //
        SlytherinStudents dracoMalfoy = new SlytherinStudents("Драко Малфой", 6, 5, 75, 50, 59, 45, 12);
        SlytherinStudents grahamMontague = new SlytherinStudents("Грэхэм Монтегю", 6, 5, 75, 50, 75, 50, 41);
        SlytherinStudents gregoryGoyle = new SlytherinStudents("Грегори Гойл", 6, 5, 75, 50, 94, 51, 15);

        garryPotter.printAllInformationOfStudents();
        germionaGrandger.printAllInformationOfStudents();
        garryPotter.compareTotalAbility(germionaGrandger);
        garryPotter.compareGryffindorStudents(germionaGrandger);
        /*public String printAllInformationOfStudents() {
            return "Hogwarts{" +
                    "fullNameStudent='" + Hogwarts.getFullNameStudent() + '\'' +
                    ", powerOfMagic=" + Hogwarts.getPowerOfMagic() +
                    ", distanceOfTheTransgression=" + Hogwarts.getDistanceOfTheTransgression() +
                    '}';*/

        /*
Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте.
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
    }
}