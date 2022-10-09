import java.io.*;
import java.util.*;

public class DistanceB2Nodes {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
    if (node.data == data) {
      ArrayList<Integer> path = new ArrayList<>();
      path.add(node.data);
      return path;
    }
    for (Node child : node.children) {
      ArrayList<Integer> path = nodeToRootPath(child, data);
      if (path.size() > 0) {
        path.add(node.data);
        return path;
      }
    }
    return new ArrayList<>();
  }

  public static int distanceBetweenNodes(Node node, int d1, int d2){
    ArrayList<Integer> l1=nodeToRootPath(node, d1);
    ArrayList<Integer> l2=nodeToRootPath(node, d2);
    int i=l1.size()-1;
    int j=l2.size()-1;
    while(i>=0&&j>=0&&l1.get(i)==l2.get(j)){
        i--;
        j--;
    }
    return (i+1)+(j+1);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int d1 = Integer.parseInt(br.readLine());
    int d2 = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    int dist = distanceBetweenNodes(root, d1, d2);
    System.out.println(dist);
    // display(root);
  }

}