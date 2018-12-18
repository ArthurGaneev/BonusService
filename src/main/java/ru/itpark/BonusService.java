package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int purchaseAmountOfPrevious) {
        int fixedAmountOfBonuses = 1_000;

        int quantityBonusBlueCard = 50;
        int quantityBonusSilverCard = 70;
        int quantityBonusGoldCard = 100;

        int initialPurchaseAmountBlueCard = 1;
        int initialPurchaseAmountSilverCard = 15_001;

        int moneyBlueCardLimit = 15_000;
        int moneySilverCardLimit = 150_000;
        int resultBlueCard = (purchaseAmount * quantityBonusBlueCard) / fixedAmountOfBonuses;
        int resultSilverCard = (purchaseAmount * quantityBonusSilverCard) / fixedAmountOfBonuses;
        int resultGoldCard = (purchaseAmount * quantityBonusGoldCard) / fixedAmountOfBonuses;


        if (purchaseAmountOfPrevious >= initialPurchaseAmountBlueCard && purchaseAmountOfPrevious <= moneyBlueCardLimit) {
            return resultBlueCard;
        } else if (purchaseAmountOfPrevious >= initialPurchaseAmountSilverCard && purchaseAmountOfPrevious <= moneySilverCardLimit) {
            return resultSilverCard;
        } else {
            return resultGoldCard;
        }
    }
}
