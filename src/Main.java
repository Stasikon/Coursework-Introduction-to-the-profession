public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {

        employee[0] = new Employee("Пётр", "Витальевич", "Кличко", 5, 135_310);
        employee[1] = new Employee("Артём", "Евгеньевич", "Тополь", 3, 82_653);
        employee[2] = new Employee("Иван", "Анатольевич", "Кукшка", 2, 56_055);
        employee[3] = new Employee("Александр", "Алетрович", "Автор", 5, 52_530);
        employee[4] = new Employee("Кирилл", "Александрович", "Кегля", 1, 45_480);
        employee[5] = new Employee("Дмирий", "Никитич", "Царь", 3, 43_279);
        employee[6] = new Employee("Руслан", "Юрьевич", "Сипук", 4, 34_410);
        employee[7] = new Employee("Павел", "Евкаиевич", "Урка", 2, 29_158);
        employee[8] = new Employee("Юрий", "Алекеевич", "Гений", 1, 23_691);
        employee[9] = new Employee("Ян", "Иванович", "Киптон", 4, 20_486);


        // Базавая сложность

        // 8.а Список всех сотрудников
        printAllStaff(employee);
        // 8.b Сумма затрат на зарплаты
        sumSalary(employee);
        // 8.c Сотрудник с минимальной зарплатой
        minSalaryStaff(employee);
        // 8.d Найти сотрудника с максимальной зарплатой.
        maxSalaryStaff(employee);
        // 8.e Подсчитать среднее значение зарплат
        midSalary(employee);
        // 8.f Получить Ф. И. О. всех сотрудников
        fullNameStaff(employee);


    }
    public static void printAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int sumSalary(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
        sumSalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты "+sumSalary);
        return sumSalary;
    }
    public static void minSalaryStaff(Employee[] employees) {
        int minSalaryStaff = employees[0].getSalary();
        for (Employee i : employees) {
            int j = i.getSalary();
            if (j < minSalaryStaff) {
                minSalaryStaff = j;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой "+minSalaryStaff);
    }
    public static void maxSalaryStaff(Employee[] employees) {
        int maxSalaryStaff = employees[0].getSalary();
        for (Employee i : employees) {
            int j = i.getSalary();
            if (j > maxSalaryStaff) {
                maxSalaryStaff = j;
            }
        }
        System.out.println("Сотрудника с максимальной зарплатой"+maxSalaryStaff);
    }
    public static void fullNameStaff(Employee[] employees) {
        for (Employee i : employees) {
          String n = i.getFullName();
            System.out.println(n);
        }
    }
    public static void midSalary(Employee[] employees) {
            int sumSalary = 0;
            int cont = 0;
            for (Employee i : employees) {
                sumSalary+= i.getSalary();
            }
            cont = sumSalary / employee.length;
            System.out.println("среднее значение зарплат"+cont);
        }
    }
