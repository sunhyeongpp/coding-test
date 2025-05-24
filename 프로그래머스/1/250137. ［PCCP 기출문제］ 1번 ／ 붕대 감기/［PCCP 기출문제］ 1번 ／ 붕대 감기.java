import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int totalTime = attacks[attacks.length-1][0];
        int attackIndex = 0;
        int healCount = 0;
        int maxHealth = health;

    for (int time = 0; time <= totalTime; time++) {
        if (attackIndex < attacks.length && time == attacks[attackIndex][0]) {
            health -= attacks[attackIndex][1];
            if (health <= 0) return -1;
            healCount = 0; 
            attackIndex++;
        } else {
            healCount++;
            health = Math.min(health + bandage[1], maxHealth); 
            if (healCount == bandage[0]) {
               health = Math.min(health + bandage[2], maxHealth); 
            healCount = 0;
            }
        }
    }
return health;
    }
}
