package home.work13.flower;

import home.work13.flower.flowers.Flower;
import home.work13.flower.flowers.Rose;
import home.work13.flower.flowers.Tulip;
import home.work13.flower.flowers.Chamomile;

class Options {
    Flower getRandomFlower() {
        int rd = (int) (Math.random() * 3);
        Flower flower = null;
        switch (rd) {

            case 0:
                flower = new Rose("Rose", 45.0);
                break;
            case 1:
                flower = new Chamomile("Chamomile", 15.0);
                break;
            case 2:
                flower = new Tulip("Tulip", 20.0);
                break;
        }
        return flower;
    }

    void bunch(int amount) {
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            Flower flower = getRandomFlower();
            System.out.println(i + ". " + flower.getName() + " " + flower.getCost());
            sum += flower.getCost();
        }
        System.out.println("Bunch cost: " + sum);
    }
}
