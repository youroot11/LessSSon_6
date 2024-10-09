package org.example;

public class Sotrudnik {
        String fio;
        String dolgnost;
        String email;
        int telefon;
        int salary;
        int age;

        public Sotrudnik(String fio, String dolgnost, String email, int telefon, int salary, int age) {
                this.fio = fio;
                this.dolgnost = dolgnost;
                this.email = email;
                this.telefon = telefon;
                this.salary = salary;
                this.age = age;
        }

        public void info(){
                System.out.println(String.format("Информация о сотруднике: ФИО - %s, должность - %s, email - %s, телефон - %s, зарплата - %s, возраст -%s",
                        fio, dolgnost, email, telefon, salary, age));
        }
}
