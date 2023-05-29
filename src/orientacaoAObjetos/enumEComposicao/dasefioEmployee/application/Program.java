package orientacaoAObjetos.enumEComposicao.dasefioEmployee.application;

import orientacaoAObjetos.enumEComposicao.dasefioEmployee.entities.Adress;
import orientacaoAObjetos.enumEComposicao.dasefioEmployee.entities.Department;
import orientacaoAObjetos.enumEComposicao.dasefioEmployee.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String deptName = sc.next();

        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Telefone: ");
        String phone = sc.next();

        Adress adress = new Adress(email, phone);

        Department department = new Department(deptName, payDay, adress);


        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++) {
            System.out.printf("Dados do funcionário %d: %n", i+1);

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(name, salary);

            department.addEmployee(emp);
        }

        System.out.println();
        showReport(department);

        sc.close();
    }

    public static void showReport(Department dept) {

        System.out.println("FOLHA DE PAGAMENTO: ");
        System.out.printf("Departamento %s = R$ %.2f%n", dept.getName(), dept.payRoll());
        System.out.printf("Pagamento realizado no dia %d%n", dept.getPayDay());

        System.out.println("Funcionários: ");
        for (Employee emp : dept.getEmployees()) {
            System.out.println(emp.getName());
        }

        System.out.println("Para dúvidas favor entrar em contato: " + dept.getAdress().getEmail());
    }
}