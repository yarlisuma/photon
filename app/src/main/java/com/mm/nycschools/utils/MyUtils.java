package com.mm.nycschools.utils;

import com.mm.nycschools.pojo.Schoolnfo;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Demo on 01/05/18.
 */

public class MyUtils {
/**/
    public static List<Schoolnfo> getSchoolList(){
        List<Schoolnfo> list=new ArrayList<>();
        list.add(new Schoolnfo("31R455","Tottenville High School,","29,355,404"));
        list.add(new Schoolnfo("30Q450","Long Island City High School,","91,382,332"));
        list.add(new Schoolnfo("30Q445","William Cullen Bryant High School","70,377,402"));
        list.add(new Schoolnfo("30Q501","Frank Sinatra School of the Arts High School","7,414,402"));
        list.add(new Schoolnfo("26Q430","Francis Lewis High School,","44,390,433"));
        list.add(new Schoolnfo("25Q285","World Journalism Preparatory: A College Board School,","112,332,557"));

        return list;

    }
}
