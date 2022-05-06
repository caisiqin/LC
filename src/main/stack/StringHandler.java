package main.stack;

import java.util.Stack;

class Pair {
  int cnt;
  char ch;

  public Pair(int cnt, char ch) {
    this.cnt = cnt;
    this.ch = ch;
  }
}

public class StringHandler {

  public String removeAllKAdjacentDuplicates(String s, int k) {
    Stack<Pair> counts = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (counts.empty() || s.charAt(i) != counts.peek().ch) counts.push(new Pair(1, s.charAt(i)));
      else if (++counts.peek().cnt == k) counts.pop();
    }
    StringBuilder b = new StringBuilder();
    while (!counts.empty()) {
      Pair p = counts.pop();
      for (int i = 0; i < p.cnt; i++) {
        b.append(p.ch);
      }
    }
    return b.reverse().toString();
  }
}
