import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        GryffindorStudents garryPotter = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudents germionaGrandger = generateGryffindorStudent("Гермиона Грейнджер");
        GryffindorStudents ronYizly = generateGryffindorStudent("Рон Уизли");
        //
        HufflepuffStudents zachariahSmith = generateHufflepuffStudents("Захария Смит");
        HufflepuffStudents cedricDiggory = generateHufflepuffStudents(" Седрик Диггори");
        HufflepuffStudents justinFinchFletchley = generateHufflepuffStudents("Джастин Финч-Флетчли");
        //
        RavenclawStudents zhouChang = generateRavenclawStudents("Чжоу Чанг");
        RavenclawStudents padmaPatil = generateRavenclawStudents("Падма Патил");
        RavenclawStudents marcusBelby = generateRavenclawStudents("Маркус Белби");
        //
        SlytherinStudents dracoMalfoy = generateSlytherinStudents("Драко Малфой");
        SlytherinStudents grahamMontague = generateSlytherinStudents("Грэхэм Монтегю");
        SlytherinStudents gregoryGoyle = generateSlytherinStudents("Грегори Гойл");

        garryPotter.printAllInformationOfStudents();
        germionaGrandger.printAllInformationOfStudents();
        zachariahSmith.printAllInformationOfStudents();
        zhouChang.printAllInformationOfStudents();
        dracoMalfoy.printAllInformationOfStudents();
        garryPotter.compareTotalAbility(germionaGrandger);
        garryPotter.compareGryffindorStudents(germionaGrandger);
        garryPotter.compareTotalAbility(dracoMalfoy);
    }

    private static GryffindorStudents generateGryffindorStudent(String fullNameStudent) {
        return new GryffindorStudents(
                fullNameStudent,
                RANDOM.nextInt(10),
                RANDOM.nextInt(10),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudents generateHufflepuffStudents(String fullNameStudent) {
        return new HufflepuffStudents(
                fullNameStudent,
                RANDOM.nextInt(10),
                RANDOM.nextInt(10),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    } private static RavenclawStudents generateRavenclawStudents(String fullNameStudent) {
        return new RavenclawStudents(
                fullNameStudent,
                RANDOM.nextInt(10),
                RANDOM.nextInt(10),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    } private static SlytherinStudents generateSlytherinStudents(String fullNameStudent) {
        return new SlytherinStudents(
                fullNameStudent,
                RANDOM.nextInt(10),
                RANDOM.nextInt(10),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}