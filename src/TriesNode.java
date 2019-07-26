import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class TriesNode {
	private Map<Character, TriesNode> nodeMap;
	private boolean isWholeWord;

	public TriesNode() {
		nodeMap = new HashMap<Character, TriesNode>();
		isWholeWord = false;
	}

	public void add(String str) {
		if (str.isEmpty()) {
			return;
		}
		if (nodeMap.containsKey(str.charAt(0))) {
			nodeMap.get(str.charAt(0)).add(str.substring(1));
		} else {
			nodeMap.put(str.charAt(0), new TriesNode());
		}
	}

	public boolean searchWord(String word) {
		if (word.isEmpty()) {
			return this.isWholeWord;
		}

		TriesNode currentNode = null;
		if (nodeMap.containsKey(word.charAt(0))) {
			currentNode = nodeMap.get(word.charAt(0));
			return currentNode.searchWord(word.substring(1));
		}
		return false;

	}

	public boolean startWith(String word) {
		if (word.isEmpty()) {
			return true;
		}

		TriesNode currentNode = null;

		if (nodeMap.containsKey(word.charAt(0))) {
			currentNode = nodeMap.get(word.charAt(0));
			return currentNode.startWith(word.substring(1));
		}

		return false;
	}
}
