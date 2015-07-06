package zjj.dp.interpreter.example.charactercommand;

import java.util.StringTokenizer;
/*
 * author: zjj
 * date: 2015/6/5
 * func: 解释器的全局环境类，存放解析的token串以及当前解析的token
 */
public class Context {
	private StringTokenizer tokenizer;
	private String currentToken;
	
	public Context(String text) {
		tokenizer = new StringTokenizer(text);
		this.nextToken();
	}
	
	public String nextToken() {
		if(tokenizer.hasMoreTokens()) {
			currentToken = tokenizer.nextToken();
		}else {
			currentToken = null;
		}
		return currentToken;
	}
	
	public String currentToken() {
		return this.currentToken;
	}
	
	public void skipToken(String token) {
		if(!token.equals(currentToken)) {
			System.out.println("解释错误！");
		}
		else {
			this.nextToken();
		}
	}
	
	public int currentNumber() {
		int number;
		number = Integer.parseInt(currentToken);
		return number;
	}
}
