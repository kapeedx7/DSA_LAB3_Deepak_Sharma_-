package com.gl.BSTPairFinder;

//********Main Class Implementing the BSTPairFinder Algorithm for given instance******* 
public class BSTPairFinderTest {
	public static void main(String[] args) {

		BinarySearchTree bst = BSTUtils.sampleBST();

		// ...***Used 120 as Sample for finding the pairs based on the hard coded nodes
		// provided****...
		BSTPairFinder pairFinder = new BSTPairFinder(bst, 120);

		pairFinder.findPairs();

	}

}
