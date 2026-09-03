public class Main {
    void main() {
        // Opgave 1

        double egg = 25.50;
        double milk = 15.00;
        double car = 30.00;
        double tax = 25.00;

        double subTotal = egg + milk + car;

        double includeTax = subTotal + (subTotal * tax / 100.0);

        System.out.println(subTotal);
        System.out.println(includeTax);

        // Opgave 2

        double food = 450.0;
        double drinks = 120.0;
        double tip = 50.0;
        int people = 4;

        double total = food + drinks + tip;
        double perPerson = total / people;

        System.out.println(total);
        System.out.println(perPerson);

        // Opgave 3

        /*
        double price = 300.0;
        double salePercent = 20.0;
        double taxPercent = 25.0;

        double discounted = price - (price * salePercent / 100);

        double finalPrice = discounted + (discounted * taxPercent / 100);

        System.out.println(price);
        System.out.println(discounted);
        System.out.println(finalPrice);
         */

        // Opgave 4

        int guests = 15;
        int cupcakes = 40;

        double cupcakesPerGuest = cupcakes/guests;
        double cupcakesLeft = cupcakes % guests;

        System.out.println(cupcakesPerGuest);
        System.out.println(cupcakesLeft);

        System.out.println(cupcakesPerGuest);
        System.out.println(cupcakesLeft);

        // Opgave 5
/*

        StringBuilder sb = new StringBuilder();
        String name = "Anna";
        int age = 25;

        sb.append("Hello, ");
        sb.append(name);
        sb.append("! ");
        sb.append("You are ");
        sb.append(age);
        sb.append(" Years old!");

        System.out.println(sb);
*/

        // Opgave 6

        int score = 100;
        System.out.println(score);

        score += 50;
        System.out.println(score);

        score += 25;
        System.out.println(score);

        // Opgave 7

        int health = 100;
        health -= 15;
        System.out.println(health);

        health -= 20;
        System.out.println(health);

        // Opgave 8

        /*
        double price = 50.0;
        System.out.println(price);
        price *= 2;

        System.out.println(price);
        */

        // Opgave 9

        /*
        int count = 10;
        System.out.println(count);

        count++;
        System.out.println(count);

        count--;
        System.out.println(count);
        */

        // Opgave 10

        int count = 10;
        count += 5;
        System.out.println(count);

        count -= 3;
        System.out.println(count);

        count++;
        System.out.println(count);

        count--;
        System.out.println(count);

        // Opgave 11

        String item = "Laptop";
        double price = 7999.99;
        boolean inStock = true;
        int leftInStock = 15;
        double discountPercent = 10.0;
        String category = "Electronics";

        // Opgave 12

/*
        String name = "Anna";
        int testPoints = 85;
        int assignmentPoints = 92;
        double finalGrade = 88.5;
        boolean isPassed = true;
*/

        // Opgave 13

        String guestName = "Peter Hansen";
        int roomNumber = 204;
        int bookedNights = 3;
        double pricePerNight = 899.00;
        boolean breakfastIncluded = true;
        double finalPrice = 2697.00;

        // Opgave 14

        int stepsToday = 8547;
        int stepGoal = 10000;
        double kmWalked = 6.2;
        int caloriesBurnt = 420;
        boolean goalReached = false;

        // Opgave 15

        String title = "One Piece volume 1";
        String author = "Eiichiro Oda";
        long ISBN = 9781591163640L;
        int pages = 200;
        boolean isRentable = false;
        String renting = "Monkey D. Luffy";
        int[] returnDate = {2026, 3, 14}; // YYYY, MM, DD
        double lateReturnTax = 149.99;
        boolean isBestSeller = true;
        double rating = 4.89;
    }
}