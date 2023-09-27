public class CalculateElectricityBill {
    private static final int[] THRESHOLDS = {50, 100, 200, 300, 400};
    private static final double[] PRICES = {1728, 1786, 2074, 2612, 2919, 3015};

    public double calculateBill(int unitsConsumed) {
        if (unitsConsumed < 0) {
            throw new IllegalArgumentException("Invalid");
        }

        double totalBill = 0.0;
        int currentTier = 0;

        switch (currentTier) {
            case 0:
                if (unitsConsumed > THRESHOLDS[0]) {
                    int unitsInThisTier = THRESHOLDS[0];
                    totalBill += PRICES[0] * unitsInThisTier;
                    currentTier++;
                } else {
                    int unitsInThisTier = unitsConsumed;
                    totalBill += PRICES[0] * unitsInThisTier;
                    break;
                }
            case 1:
                if (unitsConsumed > THRESHOLDS[1]) {
                    int unitsInThisTier = THRESHOLDS[1] - THRESHOLDS[0];
                    totalBill += PRICES[1] * unitsInThisTier;
                    currentTier++;
                } else {
                    int unitsInThisTier = unitsConsumed - THRESHOLDS[0];
                    totalBill += PRICES[1] * unitsInThisTier;
                    break;
                }
            case 2:
                if (unitsConsumed > THRESHOLDS[2]) {
                    int unitsInThisTier = THRESHOLDS[2] - THRESHOLDS[1];
                    totalBill += PRICES[2] * unitsInThisTier;
                    currentTier++;
                } else {
                    int unitsInThisTier = unitsConsumed - THRESHOLDS[1];
                    totalBill += PRICES[2] * unitsInThisTier;
                    break;
                }
            case 3:
                if (unitsConsumed > THRESHOLDS[3]) {
                    int unitsInThisTier = THRESHOLDS[3] - THRESHOLDS[2];
                    totalBill += PRICES[3] * unitsInThisTier;
                    currentTier++;
                } else {
                    int unitsInThisTier = unitsConsumed - THRESHOLDS[2];
                    totalBill += PRICES[3] * unitsInThisTier;
                    break;
                }
            case 4:
                if (unitsConsumed > THRESHOLDS[4]) {
                    int unitsInThisTier = THRESHOLDS[4] - THRESHOLDS[3];
                    totalBill += PRICES[4] * unitsInThisTier;
                    currentTier++;
                } else {
                    int unitsInThisTier = unitsConsumed - THRESHOLDS[3];
                    totalBill += PRICES[4] * unitsInThisTier;
                    break;
                }
            case 5:
                int unitsInThisTier = unitsConsumed - THRESHOLDS[4];
                totalBill += PRICES[5] * unitsInThisTier;
                break;
        }

        return totalBill;
    }
}
