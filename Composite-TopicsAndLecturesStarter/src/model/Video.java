package model;

import java.util.ArrayList;
import java.util.List;

public class Video extends Module{


    private List<Lecture> lectures = new ArrayList<>();
    private List<Topic> topics = new ArrayList<>();
    private String name;

    public Video (String name) {
        this.name = name;
    }

    public void display(String indentLevel) {};
}
