package org.example;

public class Main {
    public static void main(String[] args) {
        Sotrudnik[] sotrudnikArray = new Sotrudnik[4];
        sotrudnikArray[0] = new Sotrudnik("Веселая Валентина Ивановна", "директор", "director@mail.ru", 335577, 100000, 30);
        sotrudnikArray[1] = new Sotrudnik("Невеселая Инна Ивановна", "замдиректор", "zamdirector@mail.ru", 335576, 90000, 31);
        sotrudnikArray[2] = new Sotrudnik("Осенняя Нина Ивановна", "мастер", "zamzamdirector@mail.ru", 335575, 80000, 32);
        sotrudnikArray[3] = new Sotrudnik("Весенняя Галина Ивановна", "логист", "zamzamzamdirector@mail.ru", 335574, 70000, 33);

        sotrudnikArray [0].info();
        Park.Karusel karusel = new Park.Karusel("Солнышком", "12.00-22.00", 1000);

    }
}