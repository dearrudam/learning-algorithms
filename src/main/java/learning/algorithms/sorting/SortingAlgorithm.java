/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.algorithms.sorting;

import java.util.Comparator;

/**
 *
 * @author dearrudam
 */
public interface SortingAlgorithm {

    public <T>T[] sort(T[] items,Comparator<T> comparator);

}
