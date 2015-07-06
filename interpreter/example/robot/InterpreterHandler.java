package zjj.dp.interpreter.example.robot;

import java.util.Stack;

public class InterpreterHandler {
	private String words;
	DirectionNode dir = null;
	DistanceNode dis = null;
	ActionNode act = null;
	INode left = null;
	INode right = null;
	AndNode and = null;
	
	public InterpreterHandler(String words) {
		this.words = words;
	}

	public INode handle() {
		String word[] = words.split(" ");
		Stack s = new Stack();
		for(int i=0;i<word.length;i++) {
			if(word[i].equals("and")) {
				left = (INode) s.pop();
				String word1 = word[++i];
				dir = new DirectionNode(word1);
				String word2 = word[++i];
				act = new ActionNode(word2); 
				String word3 = word[++i];
				dis = new DistanceNode(word3);
				right = new SentenceNode(dir,act,dis);
				s.push(new AndNode(left,right));
			}else {
				String word1 = word[i++];
				dir = new DirectionNode(word1);
				String word2 = word[i++];
				act = new ActionNode(word2); 
				String word3 = word[i];
				dis = new DistanceNode(word3);
				left = new SentenceNode(dir,act,dis);
				s.push(left);
			}
		}
		
		INode node = (INode) s.pop();
		return node;
	}
	
	public String output(INode node) {
		String result = node.interpret();
		return result;
	}
}
