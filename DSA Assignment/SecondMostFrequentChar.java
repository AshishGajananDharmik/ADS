public class SecondMostFrequentChar {
    public static void main(String[] args) {
        String input = "Classrooms";
        char secondMostFreqChar = findSecondMostFrequentChar(input);
        System.out.println("Second most frequent character: " + secondMostFreqChar);
    }

    public static char findSecondMostFrequentChar(String input) {
        int[] charCounts = new int[256]; 

        
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charCounts[c]++;
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        int secondMaxFreq = Integer.MIN_VALUE;
        char secondMostFreqChar = '\0';

        
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > maxFreq) {
                secondMaxFreq = maxFreq;
                maxFreq = charCounts[i];
                secondMostFreqChar = (char) i;
            } else if (charCounts[i] > secondMaxFreq && charCounts[i] != maxFreq) {
                secondMaxFreq = charCounts[i];
                secondMostFreqChar = (char) i;
            }
        }

        return secondMostFreqChar;
    }
}
