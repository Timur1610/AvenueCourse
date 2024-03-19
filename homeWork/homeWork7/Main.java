package homeWork.homeWork7;

public class Main {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();
        Tour tour = new Tour("jygghkj", 54, "sefcv", 32);
        Tour tour2 = new Tour("jygghkj", 354, "sefcv", 685);
        Tour tour3 = new Tour("jygghkj", 234, "sefcv", 543);
        Tour tour4 = new Tour("jygghkj", 13, "sefcv", 12);
        Tour tour5 = new Tour("jygghkj", 34, "sefcv", 89);
        Tour tour6 = new Tour("jygghkj", 67, "sefcv", 47);
        travelAgency.addTour(tour);
        travelAgency.addTour(tour2);
        travelAgency.addTour(tour3);
        travelAgency.addTour(tour4);
        travelAgency.addTour(tour5);
        travelAgency.addTour(tour6);
        travelAgency.printInfoAboutAllTours();
        travelAgency.cheapestTour();

    }
}
