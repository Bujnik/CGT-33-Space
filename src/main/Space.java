package main;

import java.util.ArrayList;
import java.util.List;

public class Space {
        private int width;
        private int height;
        private Spaceship ship;
        private List<Ufo> ufos = new ArrayList<>();
        private List<Rocket> rockets = new ArrayList<>();
        private List<Bomb> bombs = new ArrayList<>();

        public void setShip(Spaceship ship) {
        this.ship = ship;
    }

        public int getWidth() {
        return width;
    }

        public int getHeight() {
        return height;
    }

        public Spaceship getShip() {
        return ship;
    }

        public List<Ufo> getUfos() {
        return ufos;
    }

        public List<Rocket> getRockets() {
        return rockets;
    }

        public List<Bomb> getBombs() {
        return bombs;
    }

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

        public static void main(String[] args) {

    }

    public void run(){

    }

    /**
     * This method is responsible for drawing game field "frame"
     */
    public void draw(){

    }

    public void sleep (int ms){

    }
}
