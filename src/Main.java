public class Main {
    public static void main(String[] args) {
        Emploe[] emploe = new Emploe[3];



        emploe[0] = new Emploe("Pol", 2, 20000);
        emploe[1] = new Emploe("Pol2", 1, 90000);
        emploe[2] = new Emploe("Pol3", 3, 50000);
        printAllEmploe(emploe);
    }

    public static void printAllEmploe(Emploe[]emploes) {
        for (Emploe emploe : emploes) {
            System.out.println(emploe);
        }
    }

}