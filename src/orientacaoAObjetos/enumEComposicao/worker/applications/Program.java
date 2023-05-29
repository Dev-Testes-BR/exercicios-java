package orientacaoAObjetos.enumEComposicao.worker.applications;

import orientacaoAObjetos.enumEComposicao.worker.entities.Department;
import orientacaoAObjetos.enumEComposicao.worker.entities.HourContract;
import orientacaoAObjetos.enumEComposicao.worker.entities.Worker;
import orientacaoAObjetos.enumEComposicao.worker.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.next();

        Department department = new Department(departmentName);

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.next());

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, level, baseSalary, department);

        System.out.print("How many contracts to this work? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter contract #%d data: %n", i+1);

            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(date, valuePerHour, hours);

            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");

        String stringDate = sc.next();

        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment().getName());

        int year = Integer.parseInt(stringDate.substring(3));
        int month = Integer.parseInt(stringDate.substring(0, 2));

        System.out.printf("Income for %s: %s%n", stringDate, worker.income(year, month));

        sc.close();
    }
}