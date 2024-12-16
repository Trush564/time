public class ATM {
    int balance;
    public ATM(int balance) {
        this.balance = balance;
    }
    public synchronized void withdraw(String clients, int suma){
        if (suma<=balance){
            balance -=suma;
            System.out.println(Thread.currentThread().getName()+"Знято"+ suma +"грн");
        }else{
            System.out.println(Thread.currentThread().getName()+"Недостатньо коштів"+ suma +"грн");
        }
    }
}
