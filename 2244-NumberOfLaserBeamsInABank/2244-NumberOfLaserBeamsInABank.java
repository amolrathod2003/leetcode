// Last updated: 4/1/2026, 10:40:32 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        if (bank == null || bank.length == 0) {
            return 0;
        }
        int totalBeams = 0;
        int prevRowDevice = countDevice(bank[0]);
        for (int i = 1; i < bank.length; i++) {
            int curRowDevice = countDevice(bank[i]);
            if (curRowDevice == 0) {
                continue;
            }
            totalBeams += prevRowDevice * curRowDevice;
            prevRowDevice = curRowDevice;
        }
        return totalBeams;
    }

    private int countDevice(String row) {
        int deviceCount = 0;
        for (char cell : row.toCharArray()) {
            if (cell == '1') {
                deviceCount++;
            }
        }
        return deviceCount;
    }
}
