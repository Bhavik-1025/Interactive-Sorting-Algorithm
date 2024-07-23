package com.sortingvisualisation.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class SortingService {

    public String[] sortData(String[] data, String algorithm) {
        List<String> dataList = Arrays.asList(data);
        switch (algorithm.toLowerCase()) {
            case "bubble":
                bubbleSort(data);
                break;
            case "selection":
                selectionSort(data);
                break;
            case "insertion":
                insertionSort(data);
                break;
            default:
                throw new IllegalArgumentException("Invalid sorting algorithm: " + algorithm);
        }
        return data;
    }

    private void bubbleSort(String[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    // Swap data[j] and data[j + 1]
                    String temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    private void selectionSort(String[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap data[i] and data[minIndex]
            String temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    private void insertionSort(String[] data) {
        int n = data.length;
        for (int i = 1; i < n; ++i) {
            String key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].compareTo(key) > 0) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }
}
