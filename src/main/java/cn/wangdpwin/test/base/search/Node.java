package cn.wangdpwin.test.base.search;

import java.util.ArrayList;

/**
 * @Author: wangdongpeng
 * @Date: 2019/7/18 下午11:11
 * @Description
 * @Version 1.0
 */
public class Node {

    //    A Unique Identifier for our node
    public String stationName;
    //    An arraylist containing a list of Nodes that
    //    This node is directly connected to - It's child nodes.
    Node leftChild;
    Node rightChild;

    public Node(String stationName, Node firstChild, Node secondChild){
        this.stationName = stationName;
        this.leftChild = firstChild;
        this.rightChild = secondChild;
    }

    public ArrayList<Node> getChildren(){
        ArrayList<Node> childNodes = new ArrayList<>();
        if(this.leftChild != null)
        {
            childNodes.add(leftChild);
        }
        if(this.rightChild != null) {
            childNodes.add(rightChild);
        }
        return childNodes;
    }

    //    An auxiliary function which allows
    //    us to remove any child nodes from
    //    our list of child nodes.
    public boolean removeChild(Node n){
        return false;
    }

}