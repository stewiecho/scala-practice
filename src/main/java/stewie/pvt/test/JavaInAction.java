package stewie.pvt.test;

import org.parboiled.common.StringUtils;

import java.io.File;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//import static java.util.stream.Collectors.toList;

/**
 * Created by Stewie on 2016. 7. 10..
 */
public class JavaInAction {

    public static void main(String[] args) {

        File[] hiddenFiles = new File(".").listFiles(File::isHidden);

        String[] strArray = {"abcd","defg","a","b"};
        List<String> list = Arrays.asList(strArray);

        // Test Commit


        Map<Integer, List<String>> rtnMap = list.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(rtnMap);

        Predicate<String> test = (String s) -> s.contains("alpha");


    }
}
