public class Client extends Person{
    private int sum; // змінна для зберігання суми на рахунку
    private String bank;

    public Client(String name, String bank, int sum) {

        super(name);
        this.bank=bank;
        this.sum=sum;
    }

    public void display(){

        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    public String getBank(){ return bank; }
    public int getSum(){ return sum; }

    @Override
    public String toString() {
        return "Client{" +
                "sum=" + sum +
                ", bank='" + bank + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
