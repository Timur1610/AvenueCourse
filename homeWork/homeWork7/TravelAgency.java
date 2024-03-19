package homeWork.homeWork7;

import java.util.ArrayList;
import java.util.Collections;


public class TravelAgency {
    private ArrayList<Tour> tours = new ArrayList<>();

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public void printInfoAboutAllTours() {
        System.out.println(tours);
    }

    public void cheapestTour() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Tour cheap : tours) {
            arrayList.add(cheap.getPrice());
        }
        System.out.println(Collections.min(arrayList));

    }

}

