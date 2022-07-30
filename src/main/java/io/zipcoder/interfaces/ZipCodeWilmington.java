package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington instance = new ZipCodeWilmington();

    private static final Instructors instanceInstructors = new Instructors();
    private static final Students instanceStudents = new Students();

    private Map<Student, Double> studyMap = new HashMap<>();




    public static ZipCodeWilmington getInstance() {
        return instance;
    }


    public void add(Educator instructor){
        instanceInstructors.instanceList.add(instructor);
    }

    public void add(Student student){
        instanceStudents.instanceList.add(student);
    }


    public void hostLecture(Educator teacher, double numberOfHours) {
        teacher.lecture(instanceStudents.instanceList, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        for(int i = 0; i<instanceInstructors.instanceList.size(); i++){
            if(instanceInstructors.instanceList.get(i).getInstructor().getId()==id){
                instanceInstructors.instanceList.get(i).getInstructor().lecture(instanceStudents.instanceList, numberOfHours);
                if(instanceInstructors.instanceList.get(i).getInstructor() == Educator.INSTRUCTOR1.getInstructor()){
                    Educator.INSTRUCTOR1.setTimeWorked(numberOfHours);
                } else if(instanceInstructors.instanceList.get(i).getInstructor() == Educator.INSTRUCTOR2.getInstructor()){
                    Educator.INSTRUCTOR2.setTimeWorked(numberOfHours);
                }
            }
        }

    }

    public Map<Student, Double> getStudyMap() {
        for(int i = 0; i<studyMap.size(); i++) {
            studyMap.put(instanceStudents.instanceList.get(i), instanceStudents.instanceList.get(i).getTotalStudyTime());
        }
        return studyMap;
    }






}
