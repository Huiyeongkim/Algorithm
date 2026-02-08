class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];

        int cur = health;
        int combo = 0;
        int prev = 0;

        for (int[] a : attacks) {
            int at = a[0];
            int damage = a[1];

            int gap = at - prev - 1;
            if (gap > 0) {
                int total = combo + gap;
                int bonus = total / t;
                long heal = (long) gap * x + (long) bonus * y;
                cur = (int) Math.min(health, cur + heal);
                combo = total % t;
            }

            cur -= damage;
            if (cur <= 0) return -1;

            combo = 0;
            prev = at;
        }

        return cur;
    }
}
