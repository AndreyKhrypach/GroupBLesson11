public class Employee extends Person{

    private String company;
   public  Employee(String name, String company){
        super(name);    // якщо базовий клас визначає(має) конструктор
        //  то клас наслідник повинен його викликати
       this.company = company;
    }

    public String getCompany(){ return company; }

    public void display(){

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
