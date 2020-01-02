//Print lines having more than 4 words uding lambda expression

package com.deloitte.file.operations;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	//Files.list(Paths.get(".")).filter(s->s.toString()).forEach(sysout::println);
           @SuppressWarnings("unused")
		List<String> lines= Files.lines(Paths.get("Hello.txt"))
          // .filter(s->(s.toString().split(" ")).length>=3)
           //.map(String::toUpperCase)
           .collect(Collectors.toList());
           //.forEach(System.out::println);	
        }
        catch(Exception ex)
        {
        	System.out.println(ex);
        }
	}

}
