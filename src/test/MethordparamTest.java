package test;

public class MethordparamTest {
	public static void main(String []args){
		Word word = new MethordparamTest().new Word();
		word.setWord("Hello World");
		resetWord(word);
		System.out.println(word.getWord());
		
	}

	private static void resetWord(Word word) {
		word.setWord("damn, it has been changed");
	}
	
	
	
	
	public class Word{
		private String word = "";
		
		public void setWord(String word){
			this.word = word;
		}
		
		public String getWord(){
			return this.word;
		}
	}
}
