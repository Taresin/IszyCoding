package samples.objects;

public class ObjectsProgram {

    public static void main(String[] args) {
        Expense iceCream = new Expense();
        iceCream.amount = 3;
        iceCream.description = "Ice Cream";

        Expense burger = new Expense(10, "Burger");
        burger.getChange(20);
    }

    public static class Expense {
        double amount;
        String description;

        public Expense() {
        }

        public Expense(double amount, String description) {
            this.amount = amount;
            this.description = description;
        }

        public double getChange(double customerMoney) {
            return customerMoney - amount;
        }
    }
}
