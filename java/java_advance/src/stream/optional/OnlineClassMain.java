package stream.optional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class OnlineClassMain {
    public static void main(String[] args) {
        List<OnlineClass> classList = new ArrayList<>();
        classList.add(new OnlineClass(1, "java_basic programming", false));
        classList.add(new OnlineClass(2, "java_advance programming", false));
        classList.add(new OnlineClass(3, "java_work programming", false));
        classList.add(new OnlineClass(4, "database programming", false));

        OnlineClass java_basic = new OnlineClass(1, "java_basic_programming", true);

        /*Duration studyDuration = java_basic.getProgress().getStudyDuration();
        Progress progress = java_basic.getProgress();
        if (progress != null) {
            System.out.println("studyDuration = " + studyDuration);*/
        }
    }
