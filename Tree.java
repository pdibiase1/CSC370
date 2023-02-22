package tree;

import java.util.ArrayList;

public class Tree 
{
    private String value;
    private ArrayList<Tree> children;

    public Tree(String value) 
    {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(Tree child) 
    {
        this.children.add(child);
    }

    public void draw() 
    {
        draw("", true);
    }

    private void draw(String prefix, boolean isTail) 
    {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + this.value);

        for (int i = 0; i < this.children.size() - 1; i++) 
        {
            this.children.get(i).draw(prefix + (isTail ? "    " : "│   "), false);
        }

        if (this.children.size() > 0) 
        {
            this.children.get(this.children.size() - 1).draw(prefix + (isTail ?"    " : "│   "), true);
        }
    }

    public static void main(String[] args) 
    {
        Tree root = new Tree("A");
        Tree child1 = new Tree("B");
        Tree child2 = new Tree("C");
        Tree child3 = new Tree("D");

        root.addChild(child1);
        root.addChild(child2);
        child2.addChild(child3);

        root.draw();
    }
}
