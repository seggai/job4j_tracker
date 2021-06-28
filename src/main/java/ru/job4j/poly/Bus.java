package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void passengers(int numbers) {
        int space = 70;
        if (space - numbers > 0) {
            System.out.println("Enough space for passengers");
        } else {
            System.out.println("Too much passengers");
        }
    }

    @Override
    public void ride() {
        System.out.println("London to Moscow");

    }

    @Override
    public int fuel(int count) {
        int price = count * 35;
        return price;
    }
}
