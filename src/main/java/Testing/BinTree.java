package Testing;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BinTree implements Serializable {

    int value;
    BinTree left;
    BinTree right;

    public BinTree(int value, BinTree left, BinTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinTree getLeft() {
        return left;
    }

    public void setLeft(BinTree left) {
        this.left = left;
    }

    public BinTree getRight() {
        return right;
    }

    public void setRight(BinTree right) {
        this.right = right;
    }
}
