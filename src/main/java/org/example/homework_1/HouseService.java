package org.example.homework_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    private List<House> evList = new ArrayList<>();
    private List<House> villaList = new ArrayList<>();
    private List<House> yazlikList = new ArrayList<>();

    public HouseService() {
        // Initialize with sample data
        evList.add(new Ev(100000, 120, 3, 1));
        evList.add(new Ev(120000, 130, 4, 1));
        evList.add(new Ev(140000, 140, 3, 2));

        villaList.add(new Villa(300000, 250, 5, 2));
        villaList.add(new Villa(350000, 300, 6, 3));
        villaList.add(new Villa(400000, 320, 5, 2));

        yazlikList.add(new Yazlik(200000, 150, 4, 1));
        yazlikList.add(new Yazlik(220000, 160, 3, 2));
        yazlikList.add(new Yazlik(250000, 170, 4, 2));
    }

    public List<House> getEvList() {
        return evList;
    }

    public List<House> getVillaList() {
        return villaList;
    }

    public List<House> getYazlikList() {
        return yazlikList;
    }

    public double getTotalPriceOfEvs() {
        return evList.stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return villaList.stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfYazliks() {
        return yazlikList.stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfAllHouses() {
        return getTotalPriceOfEvs() + getTotalPriceOfVillas() + getTotalPriceOfYazliks();
    }

    public double getAverageAreaOfEvs() {
        return evList.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfVillas() {
        return villaList.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfYazliks() {
        return yazlikList.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfAllHouses() {
        double totalArea = evList.stream().mapToDouble(House::getArea).sum()
                + villaList.stream().mapToDouble(House::getArea).sum()
                + yazlikList.stream().mapToDouble(House::getArea).sum();
        int totalCount = evList.size() + villaList.size() + yazlikList.size();
        return totalArea / totalCount;
    }

    public List<House> filterHousesByRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms) {
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(evList);
        allHouses.addAll(villaList);
        allHouses.addAll(yazlikList);

        return allHouses.stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms && house.getNumberOfLivingRooms() == numberOfLivingRooms)
                .collect(Collectors.toList());
    }
}
