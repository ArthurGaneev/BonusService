package ru.itpark;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    @BeforeEach
    void calculateBonus() {
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(0, 0);

            assertEquals(0, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(1_000, 0);

            assertEquals(50, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(1_000, 15_000);

            assertEquals(50, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(0, 15_000);

            assertEquals(0, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(20000, 15_000);

            assertEquals(1000, bonus);
        }

        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(1_000,15_001);

            assertEquals(70, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(0,15_001);

            assertEquals(0, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(20_000,15_001);

            assertEquals(1400, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(1_000, 150_001);

            assertEquals(100, bonus);
        }
        {
            BonusService sercice = new BonusService();
            int bonus = sercice.calculateBonus(3_000, 150_001);

            assertEquals(300, bonus);
        }




    }
}