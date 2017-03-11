package com.dmoney.dto;

import java.util.List;

/**
 * Created by drew on 3/10/17.
 */
public class NameList {

    private final List<String> names;

    public NameList(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }
}
