// Last updated: 4/1/2026, 10:39:31 PM
class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n = instructions.length;
        long score = 0;
        int i = 0;
        Set<Integer> visited = new HashSet<>();

        while (i >= 0 && i < n && !visited.contains(i)) {
            visited.add(i);
            if (instructions[i].equals("add")) {
                score += values[i];
                i++;
            } else if (instructions[i].equals("jump")) {
                i += values[i];
            } else {
                throw new IllegalArgumentException("Invalid instruction: " + instructions[i]);
            }
        }

        return score;
    }
}