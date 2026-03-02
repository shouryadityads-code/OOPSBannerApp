public class OOPSBannerAPP {
	static class CharacterPattern {
		private char character;
        private String[] pattern;
		
		public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
		
		public char getCharacter() {
            return character;
        }
		
		public String[] getPattern() {
            return pattern;
        }
    }
	
	public static CharacterPattern createOPattern() {
        return new CharacterPattern('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });
    }
	
	public static CharacterPattern createPPattern() {
        return new CharacterPattern('P', new String[]{
                "******** ",
                "*       *",
                "*       *",
                "******** ",
                "*        ",
                "*        ",
                "*        "
        });
    }
	
	public static CharacterPattern createSPattern() {
        return new CharacterPattern('S', new String[]{
                " ******* ",
                "*        ",
                "*        ",
                " ******* ",
                "        *",
                "        *",
                " ******* "
        });
    }
	
	public static void main(String[] args) {
		CharacterPattern[] characters = {
                createOPattern(),
                createOPattern(),
                createPPattern(),
                createSPattern()
        };
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < characters.length; j++) { 
				System.out.print(characters[j].getPattern()[i] + "  ");
			}

			System.out.println(); 
		}
	}
}