public class RainWaterCalculator {

    private static int highestNumberLocation = 0;

    public static int calculate(int arraySize, int[] numberArray){
        int rainStorageForward = 0;
        int rainStorageBackwards = 0;
        rainStorageForward = countForwards(numberArray);
        if (highestNumberLocation < arraySize){
            rainStorageBackwards = countBackwards(numberArray);
        }
        return  rainStorageForward + rainStorageBackwards;
    }

    private static int countForwards(int[] numberArray){
        int positiongToCountFrom = 0;
        int rainStorage = 0;
        int totalInBetweenWalls = 0;
        for (int i = 1; i < numberArray.length; i++){
            if (numberArray[positiongToCountFrom] <= numberArray[i]){
                totalInBetweenWalls = totalInBetweenWalls(numberArray, positiongToCountFrom +1, i);
                rainStorage += (numberArray[positiongToCountFrom] * (i - (positiongToCountFrom + 1))) - totalInBetweenWalls;
                positiongToCountFrom = i;
                highestNumberLocation = i;
            }
        }
        return rainStorage;
    }

    private static int countBackwards(int[] numberArray) {
        int positiongToCountFrom = numberArray.length - 1;
        int rainStorage = 0;
        int totalInBetweenWalls = 0;
        for (int i = positiongToCountFrom -1; i >= highestNumberLocation; i--) {
            if (numberArray[positiongToCountFrom] <= numberArray[i]) {
                totalInBetweenWalls = totalInBetweenWallsBackwards(numberArray, positiongToCountFrom - 1, i);
                rainStorage += (numberArray[positiongToCountFrom] * (positiongToCountFrom  - (i + 1))) - totalInBetweenWalls;
                positiongToCountFrom = i;
            }
        }
        return rainStorage;
    }

    private static int totalInBetweenWalls(int[] numberArray, int startingPosition, int endingPosition){
        int total = 0;
        for (int i = startingPosition; i < endingPosition; i++){
            total += numberArray[i];
        }
        return total;
    }

    private static int totalInBetweenWallsBackwards(int[] numberArray, int startingPosition, int endingPosition){
        int total = 0;
        for (int i = startingPosition; i > endingPosition; i--){
            total += numberArray[i];
        }
        return total;
    }
}
