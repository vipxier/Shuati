
public class TriePractice {
	private char character;
	private TriePractice[] children;
	private boolean word;

	public TriePractice() {
		this.character = 0;
		this.children = new TriePractice[26];
		this.word = false;
	}

	public void add(String string) {
		if (string.isEmpty()) {
			this.word = true;
			return;
		}

		int index = string.charAt(0) - 'a';

		if (this.children[index] == null) {
			this.children[index] = new TriePractice();
		}

		this.children[index].add(string.substring(1));
	}
	
	public boolean isWord(String string)
	{
		if (string.isEmpty())
		{
			return this.word;
		}
		
		int index = string.charAt(0) - 'a';
		if (this.children[index] == null)
		{
			return false;
		}
		return this.children[index].isWord(string.substring(1));
	}
	
	public boolean startWith(String string)
	{
		if (string.isEmpty() && !this.word)
		{
			return true;
		}
		else
		{
			int index = string.charAt(0) - 'a';
			if (this.children[index] == null)
			{
				return false;
			}
			else
			{
				return this.children[index].startWith(string.substring(1));
			}
		}
	}
}
