package br.com.philippesis.main;

import br.com.philippesis.methods.OneClass;

public class Main {

    public static void main(String[] args) {

        // Block NO lambda
        OneClass<String> string1 = new OneClass<String>() {
            @Override
            public String onChanged(String s) {
                return s;
            }
        };

        // Block lambda
        OneClass<String> string2 = s -> {
            return s;
        };

        System.out.println(string1.onChanged("NO lambda"));
        System.out.println(string2.onChanged("Lambda Demo"));

    }
}
