
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in) {
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == ' ') {
                if (isWord) {
                    wordCount++;  // End of a word
                    isWord = false;
                }
            } else {
                isWord = true;  // Found part of a word
            }
        }

        // If the last character(s) is part of a word, increment word count
        if (isWord) {
            wordCount++;
        }

        return wordCount;
    }
}
