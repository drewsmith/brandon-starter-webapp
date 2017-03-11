package com.dmoney.service;

import com.dmoney.dto.NameList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by drew on 3/10/17.
 */
@Service
public class NameServiceImpl implements NameService {

    private List<String> names;

    public NameServiceImpl() {
        names = new ArrayList<String>();
    }

    @Override
    public void addName(String name) {
        names.add(name);
    }

    @Override
    public NameList getNames() {
        return new NameList(names);
    }

    @Override
    public void clearNames() {
        names.clear();
    }

    @Override
    public void clearName(String name) {
        int nameIndex = names.indexOf(name);
        if(nameIndex >= 0) {
            names.remove(nameIndex);
        }
    }
}
