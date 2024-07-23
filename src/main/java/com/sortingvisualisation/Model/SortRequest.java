package com.sortingvisualisation.Model;

public class SortRequest {
    private String[] data;
    private String algorithm;

    // Getters and Setters
    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
