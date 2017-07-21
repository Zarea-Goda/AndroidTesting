/**
 * Created by Zare3 on 19/07/2017.
 */
public class SpecialAccount extends Account {

    Account user = new Account();
    double balance = user.getBalance();
    public void withdraw() {
        System.out.println(" Please enter the amount you would like to withdraw. it shoud be less than or equal 1000 LE : ");
        double amount = input.nextDouble();
        if (amount > 1000) {
            System.out.println(" please enter correct amount less than 1000 LE and less than zero ");
        } else {
            System.out.println(" done. and your balance is :" + (balance - amount));
        }

    }
}
