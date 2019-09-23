package com.neuedu.demo1;

public class Course {

    private String cno;
    private String canme;
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
        return canme;
    }

    public void setCanme(String canme) {
        this.canme = canme;
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
                ", canme='" + canme + '\'' +
                ", credit=" + credit +
                ", semester=" + semester +
                '}';
    }
}
