package circulartour;

public class Main {
    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        CircularTourSolution tour = new CircularTourSolution();
        int startIndex = tour.findStartingPoint(pumps);

        if (startIndex == -1) {
            System.out.println("No possible tour");
        } else {
            System.out.println("Start from petrol pump index: " + startIndex);
        }
    }
}

