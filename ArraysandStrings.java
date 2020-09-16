import java.util.ArrayList;
import java.util.HashMap;

class Student {
    public int getId() {
        // this is just put here
        // so the error goes away
        return 0;
    }
}

public class ArraysandStrings {
    // HashMap
    public HashMap<Integer, Student> buildMap(Student[] students) {
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        for (Student s : students)
            map.put(s.getId(), s);
        return map;
    }

    // ArrayList --> O(1)
    public ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for(String w : words)
            sentence.add(w);
        for (String w: more)
            sentence.add(w);
        return sentence;
    }

    // StringBuilder --> O(xn^2)
    String joinWords(String[] words) {
        StringBuilder sentence = new StringBuilder();
        for (String w : words) {
            sentence.append(w);
        }
        return sentence.toString();
    }


}
