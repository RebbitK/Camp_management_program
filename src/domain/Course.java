package domain;

import java.util.List;

public class Course {

    private final long idNumber;
    private String courseName;
    private CourseType type;
    private List<Grade> grades;             // 이 과목에 점수를 넣으면 회차가 증가되고 점수가 부여되면 자동으로 등급이 매겨지고..

    public Course(long idNumber, String courseName, CourseType type) {
        this.idNumber = idNumber;
        this.courseName = courseName;
        this.type = type;

    }

    // 시험 횟수가 10회이면 true, 아니라면 false 반환
    public boolean fulfillSize() {
        return grades.size() == 10;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public CourseType getType() {
        return type;
    }

    // 회차에 대한 정보를 반환
    public List<Grade> getGrades() {
        return grades;
    }

    public int getRoundScore(int round){ return grades.get(round).getScore();}

    public char getRoundRank(int round){return grades.get(round).getRank();}

    // 시험 본 평균 점수를 반환
    public double avgScore() {
        if(grades.isEmpty())
            return 0;

        return (double)totalScore() / grades.size();
    }

    public void setGrades(List<Grade> grades){
        this.grades = grades;
    }
    // 시험 본 전체 점수를 반환
    public int totalScore() {
        int total = 0;

        for(Grade grade : grades)
            total += grade.getScore();

        return total;
    }
}
