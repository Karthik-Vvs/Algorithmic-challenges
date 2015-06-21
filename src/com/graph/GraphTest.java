/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graph;

import java.util.Iterator;

/**
 *
 * @author suryakarthik.v
 */
public class GraphTest {

    public static void main(String[] args) {
        Graph g = new Graph();
        GraphAPI gapi = new GraphAPI();
        gapi.createGraph(g, false);
        gapi.printGraph(g);
        gapi.PrimsAlgo(g);
    }
}
