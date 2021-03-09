package com.example.developercrud;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DeveloperService


{
    List<Developer> arrayList=new ArrayList<Developer>(Arrays.asList(
            new Developer( 1, "Shubhangi","Java"),
            new Developer( 2, "Vishnu","ReactJS")
            ));
    public List<Developer> getAllDeveloper()
    {
        return arrayList;
    }

    public void addDeveloper(Developer developer){
        arrayList.add(developer);
    }

    public  void updateDeveloper(Developer developer, Integer developerId){

        for(int i=0;i<arrayList.size();i++)
        {
            Developer dev=arrayList.get(i);
            if(dev.getDeveloperId()==developerId);
            {
                arrayList.set(developerId,developer);
            }
        }
    }

    public  void deleteDeveloper(Integer developerId){

        for(int i=0;i<arrayList.size();i++)
        {
            Developer dev=arrayList.get(i);
            if(dev.getDeveloperId()==developerId);
            {
                arrayList.removeIf(developer->developer.getDeveloperId()==developerId);
            }
        }
    }

}
