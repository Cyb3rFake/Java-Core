package Classes_and_Objects.Practice;

public class TotalSalaries_32_3 {
    public static void main(String[] args) {
        //James
        Worker worker1 = new Worker();
        worker1.name = "James";
        worker1.salary = 200000;

        //Tom
        Worker worker2 = new Worker();
        worker2.name = "Tom";
        worker2.salary = 150000;

        System.out.println(CalculateTotalSalary(worker1.salary, worker2.salary));
    }



    //complete the function to calculate the total salary
    static int CalculateTotalSalary(int salary, int salary1) {
        return (salary+salary1);
    }
}
class Worker{
    public String name;
    public int salary;
}

