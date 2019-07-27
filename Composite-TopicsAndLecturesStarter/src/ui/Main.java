package ui;

import model.Lecture;
import model.Topic;
import model.Video;

public class Main {

    public static void main(String[] args) {
        Topic designPatterns = new Topic("Design patterns");
        Topic observer = new Topic("Observer");
        Topic composite = new Topic("Composite");
        Lecture patternsIntro = new Lecture("Intro to Patterns");
        Lecture observerIntro = new Lecture("Intro to Observer");
        Video compositeIntro = new Video("Let's Compose");
        designPatterns.addTopic(observer);
        designPatterns.addTopic(composite);
        designPatterns.addLecture(patternsIntro);
        observer.addLecture(observerIntro);
        designPatterns.display("  ");
    }


}