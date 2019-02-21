/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.algorithms;

/**
 *
 * @author dearrudam
 */
public class InsertionSortTest extends SortingAlgorithmTest{

    @Override
    protected SortingAlgorithm sortingAlgorithm() {
        return new InsertionSort();
    }
    
}
