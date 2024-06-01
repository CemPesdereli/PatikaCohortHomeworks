package org.example;

import org.example.homework_1.House;
import org.example.homework_1.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();

        // Display lists
        System.out.println("Ev List: " + houseService.getEvList());
        System.out.println("Villa List: " + houseService.getVillaList());
        System.out.println("Yazlık List: " + houseService.getYazlikList());

        // Total prices
        System.out.println("Total Price of Evs: " + houseService.getTotalPriceOfEvs());
        System.out.println("Total Price of Villas: " + houseService.getTotalPriceOfVillas());
        System.out.println("Total Price of Yazliks: " + houseService.getTotalPriceOfYazliks());
        System.out.println("Total Price of All Houses: " + houseService.getTotalPriceOfAllHouses());

        // Average areas
        System.out.println("Average Area of Evs: " + houseService.getAverageAreaOfEvs());
        System.out.println("Average Area of Villas: " + houseService.getAverageAreaOfVillas());
        System.out.println("Average Area of Yazliks: " + houseService.getAverageAreaOfYazliks());
        System.out.println("Average Area of All Houses: " + houseService.getAverageAreaOfAllHouses());

        // Filter houses
        List<House> filteredHouses = houseService.filterHousesByRoomsAndLivingRooms(3, 2);
        System.out.println("Filtered Houses (3 rooms, 2 living rooms): " + filteredHouses);
    }
}
