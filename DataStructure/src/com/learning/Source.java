package com.learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class check implements Comparable<check> {
    public int roll, marks;
    public String name;



    public check(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public String print() {
        return (roll + " " + name);
    }

    public int compareTo(check o) {

        int marksCompare = Integer.compare(o.marks, marks);
        if(marksCompare==0)
        {
            int nameCompare = name.compareTo(o.name);
            if (nameCompare != 0)
                return nameCompare;
            else{
                int rollCompare = Integer.compare(o.roll,roll);

                return rollCompare;
            }
        }else
            return marksCompare;
    }
}

class Source
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int t;
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        t =Integer.parseInt(input.readLine());
        List<check> records = new ArrayList<check>();
        while(t > 0)
        {
            String a = input.readLine();
            List<String> temp = Arrays.asList(a.split(","));
            String name = temp.get(0);
            int roll = Integer.parseInt(temp.get(1).trim());
            int marks = Integer.parseInt(temp.get(2).trim());
            records.add(new check(name, roll, marks));
            t--;
        }

        Collections.sort(records);

        for(int i=0; i<records.size(); i++)
            System.out.println(records.get(i).print());

    }
}