package com.neuedu.entity;

public class Course {

    private String cno;
    private String cname;
    private int credit;
    private int semester;

    public Course() {
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCanme() {
        return cname;
    }

    public void setCanme(String cname) {
        this.cname = cname;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", credit=" + credit +
                ", semester=" + semester +
                '}';
    }
}
