package ru.job4j.oop;

/**
 * @author Yuri.Argunov
 * @version 1.0
 * @since 07.06.2020
 */
public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
