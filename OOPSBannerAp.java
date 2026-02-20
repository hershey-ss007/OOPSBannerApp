public class OOPSBannerAp {

    /**
     * Inner static class to encapsulate character and its banner pattern
     */
    public static class CharacterPattern {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * @param character The character being represented
         * @param pattern The 7-line banner pattern for the character
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return the character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return the banner pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility methods to build patterns for O, P, S
    public static String[] buildOPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }

    public static String[] buildPPattern() {
        return new String[] {
            " *****   ",
            " *    *  ",
            " *    *  ",
            " *****   ",
            " *       ",
            " *       ",
            " *       "
        };
    }

    public static String[] buildSPattern() {
        return new String[] {
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        };
    }

    public static void main(String[] args) {
        // Create CharacterPattern objects
        CharacterPattern o1 = new CharacterPattern('O', buildOPattern());
        CharacterPattern o2 = new CharacterPattern('O', buildOPattern());
        CharacterPattern p  = new CharacterPattern('P', buildPPattern());
        CharacterPattern s  = new CharacterPattern('S', buildSPattern());

        // Array of CharacterPattern objects
        CharacterPattern[] word = { o1, o2, p, s };

        // Print banner line by line
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]);
            }
            System.out.println(line.toString());
        }
    }
}