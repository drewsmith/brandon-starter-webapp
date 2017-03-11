package com.dmoney.service;

import com.dmoney.dto.NameList;

/**
 * Created by drew on 3/10/17.
 */
public interface NameService {

    void addName(String name);

    NameList getNames();

    void clearNames();

    void clearName(String name);

}
