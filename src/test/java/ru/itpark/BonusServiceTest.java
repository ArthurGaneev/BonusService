package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(1_000, 15_000);

            assertEquals(50, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(1_000,15_001);

            assertEquals(70, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(1_000, 150_001);

            assertEquals(100, bonus);
        }


    }
}