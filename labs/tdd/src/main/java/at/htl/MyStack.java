package at.htl;

public class MyStack {

    String contents = null;

    public boolean isEmpty() {
        return contents == null;
    }

    public void push(String text) {
        contents = text;
    }

    public String pop() {
        var text = contents;
        contents = null;
        return text;
    }
}
