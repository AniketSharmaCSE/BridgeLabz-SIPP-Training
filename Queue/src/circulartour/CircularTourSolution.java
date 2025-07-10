package circulartour;

public class CircularTourSolution {
    public int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        int totalPetrol = 0;
        int totalDistance = 0;
        int start = 0;
        int surplus = 0;

        for (int i = 0; i < n; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distanceToNext;

            surplus += pumps[i].petrol - pumps[i].distanceToNext;

            if (surplus < 0) {
                // can't start from current start, try next
                start = i + 1;
                surplus = 0;
            }
        }

        if (totalPetrol < totalDistance) {
            return -1; // not possible
        }

        return start;
    }
}
