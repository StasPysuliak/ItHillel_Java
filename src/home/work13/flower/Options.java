package home.work13.flower;

import home.work13.flower.flowers.Flower;
import home.work13.flower.flowers.Rose;
import home.work13.flower.flowers.Tulip;
import home.work13.flower.flowers.Chamomile;

import java.util.ArrayList;


class Options {
    void getFlower(int[] flowers) {
        ArrayList<Flower> bunch = new ArrayList<>();
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 0; j < flowers[i]; j++) {
                switch (i) {
                    case 0:
                        bunch.add(new Rose("Rose", 45.0));
                        break;
                    case 1:
                        bunch.add(new Chamomile("Chamomile", 15.0));
                        break;
                    case 2:
                        bunch.add(new Tulip("Tulip", 20.0));
                        break;
                }
            }
        }
        bunch(bunch);
    }

    void bunch(ArrayList<Flower> bunch) {
        int sum = 0;
        for (int i = 0; i < bunch.size(); i++) {
            System.out.println(i + ". " + bunch.get(i).getName() + " " + bunch.get(i).getCost());
            sum += bunch.get(i).getCost();
        }
        System.out.println("Bunch cost: " + sum);
    }
}
