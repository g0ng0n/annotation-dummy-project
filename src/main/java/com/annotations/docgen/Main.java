package com.annotations.docgen;

import com.annotations.math.MathUtils;

public class Main {
    public static void main(String[] args) {
        DocProcessor.process(MathUtils.class);
    }
}