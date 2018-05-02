package com.mm.nycschools.pojo;

/**
 * Created by Demo on 01/05/18.
 */

public class Schoolnfo {
    String schoolName;
    String schoolDb;
    String schoolsatScore;

    public Schoolnfo(String schoolDb, String schoolName, String schoolsatScore) {
        this.schoolName = schoolName;
        this.schoolDb = schoolDb;
        this.schoolsatScore = schoolsatScore;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolDb() {
        return schoolDb;
    }

    public void setSchoolDb(String schoolDb) {
        this.schoolDb = schoolDb;
    }

    public String getSchoolsatScore() {
        return schoolsatScore;
    }

    public void setSchoolsatScore(String schoolsatScore) {
        this.schoolsatScore = schoolsatScore;
    }
}
