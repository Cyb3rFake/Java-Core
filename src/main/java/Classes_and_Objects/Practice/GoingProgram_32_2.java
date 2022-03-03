package Classes_and_Objects.Practice;

public class GoingProgram_32_2 {
    public static void main(String[] args) {
        Country c = new Country();
        c.name = "France";
        c.capital = "Paris";
        System.out.println("Country:  " + c.name);
        System.out.println("Capital:  " + c.capital);
    }

}
class Country{
    //change the code bellow
    public String name;
    protected String capital;
}
