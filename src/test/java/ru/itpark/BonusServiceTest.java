package ru.itpark;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @Test
    @BeforeEach
    void calculateBonusDefaultBlueCard() {
        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 0);

            assertEquals(50, bonus);
        }
    }
    @Test
    void calculateBonusBlueCard() {
        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 15_000);

            assertEquals(50, bonus);
        }
    }
    @Test
    void calculateBonusSilverCard() {
        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 15_001);

            assertEquals(70, bonus);
        }
    }
    @Test
    void calculateBonusGoldCard() {
        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 150_001);

            assertEquals(100, bonus);
        }
    }
}