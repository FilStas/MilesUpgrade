public class BonusMilesService {
    public int calculate(int cost) {
        int bonusOneMiles = 20;
        int price = cost / bonusOneMiles;
        return price;
    }
}
