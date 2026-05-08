/**

        * File: Lesson 5.9 - Stacks and Queues

        * Author: Owais Ali Khan

        * Date Created: May 8, 2026

        * Date Last Modified: May 8, 2026

        */

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String processBackspaces(String input) {
	    ArrayDeque<Character> deque = new ArrayDeque<Character>();
		String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        char letter = input.charAt(i);
	        if (letter != '#') {
	            deque.push(letter);
	        } else if (!deque.isEmpty()){
	            deque.pop();
	        }
	    }
	    while (!deque.isEmpty()) {
			result = deque.pop() + result;
		}
	    return result;
	}
	
	public static String simulateLine(String[] commands) {
	    ArrayDeque<String> deque = new ArrayDeque<String>();
	    for (int i=0; i < commands.length; i++) {
	        
	        String input = commands[i];
	        String command = input;
	        String name = "";
	        
	        if (input.contains(" ")) {
	            int space = input.indexOf(" ");
	            command = input.substring(0, space);
	            name = input.substring(space+1);
	            
	        }
	        
	        if (command.equals("ENQUEUE")) {
	            deque.addLast(name);
	        } else if (command.equals("VIP")) {
	            deque.addFirst(name);
	        } else if (command.equals("SERVE")) {
	            deque.removeFirst();
	        } else if (command.equals("REQUEUE")) {
	            deque.addLast(deque.pop());
	        } else {
	            deque.removeLast();
	        }
	        
	    }
	    return deque.toString();
	}

}
