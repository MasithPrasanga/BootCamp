package com.virtusa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketOrder {

	public static void main(String[] args) throws IOException {

		Map<String, SymbolInfo> bracketParts = new HashMap<String, SymbolInfo>();
		Stack<SymbolInfo> checkingStack = new Stack<SymbolInfo>();

		BracketOrder.findsymbolSymbols(bracketParts);
		boolean perfectCode = true;

		for (int i = 1; i <= bracketParts.size(); i++) {

			if (bracketParts.get("" + i).symbol == '{' || bracketParts.get("" + i).symbol == '['
					|| bracketParts.get("" + i).symbol == '(') {
				checkingStack.push(bracketParts.get("" + i));
			}
			else if (bracketParts.get("" + i).symbol == '}' || bracketParts.get("" + i).symbol == ']'
					|| bracketParts.get("" + i).symbol == ')') {
				if (checkingStack.isEmpty()) {
					System.out.println(" loop 1: Error : " + bracketParts.get("" + i).symbol + " line no is : "
							+ bracketParts.get("" + i).lineNumber);
					perfectCode = false;
					break;
				}
				else if (((checkingStack.peek().symbol == '{') && (bracketParts.get("" + i).symbol == '}'))
						|| ((checkingStack.peek().symbol == '[') && (bracketParts.get("" + i).symbol == ']'))
						|| ((checkingStack.peek().symbol == '(') && (bracketParts.get("" + i).symbol == ')'))) {
					checkingStack.pop();
				}
				else {
					SymbolInfo symbolInfo = checkingStack.peek();
					break;
				}
			}

		}

		if (perfectCode && checkingStack.isEmpty()) {
				System.out.println("Perfect Code");
		} else {
			SymbolInfo symbolInfo = checkingStack.pop();
			System.out.println("out : Error : " + symbolInfo.symbol + " line no is : " + symbolInfo.lineNumber);
		}

	}

	public static void findsymbolSymbols(Map<String, SymbolInfo> bracketParts) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("testcase1.txt"));
		String line;
		Integer mapKey = 0;
		Integer lineNumber = 0;
		while ((line = bufferedReader.readLine()) != null) {
			lineNumber++;
			for (int i = 0; i < line.length(); i++) {
				char symbol = line.charAt(i);
				if (symbol == '{' || symbol == '}' || symbol == '[' || symbol == ']' || symbol == '('
						|| symbol == ')') {
					mapKey++;
					bracketParts.put(mapKey.toString(), new SymbolInfo(symbol, lineNumber));
				}
			}
		}
	}
}

class SymbolInfo {

	Character symbol;
	Integer lineNumber;

	SymbolInfo(Character symbol, Integer lineNumber) {
		this.lineNumber = lineNumber;
		this.symbol = symbol;
	}

}
