public class CreditPaymentService {
    public int calculate(int period, int amount, double rate) {
        double monthRate = (rate/period)/100;
        double koeficient = (monthRate*(Math.pow(1+monthRate,period)))/(((Math.pow(1+monthRate,period)))-1);
        double payment = koeficient*amount;
        return (int) payment;
    }
}