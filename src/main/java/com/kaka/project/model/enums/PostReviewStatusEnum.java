package com.kaka.project.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public enum PostReviewStatusEnum {

    REVIEWING("reviewing", 0),
    PASS("pass", 1),
    REJECT("reject", 2);

    private final String text;

    private final int value;

    PostReviewStatusEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
