package run;

import weryFirst.FIO;

public class RunProg {
    public static void main(String[] args) {
        FIO Lera = new FIO();
        Lera.setFirstName("Лера");
        Lera.setMiddleName("Устала");
        Lera.setLastName("почешитеМеня");

        String fio = Lera.getFIO();
        System.out.println(fio);
    }
}