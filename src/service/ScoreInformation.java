package service;

import domain.Course;
import domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ScoreInformation {

    ArrayList<Student> list;    //arraylist 생성 (클래스가 배열에 담기게 된다 )
    Scanner sc = new Scanner(System.in);
    private String id, name;
    private int JAVA, SPRING, JPA, MYSQL, DESIGNPATTERN, SPRINGSECURITY, REDIS, MONGODB;
    ScoreInformation Scoreinformation;

    public void insert() {
        int stu_Num;
        System.out.println("몇명의 학생을 입력하시겠습니까?:");
        stu_Num = sc.nextInt();    //값 입력 받음

        for (int i = 0; i < stu_Num; i++) {        //입력 받은 수만큼 반복문

            //값 입력 부분
            System.out.println("학번을 입력하세요:");
            id = sc.nextLine();
            System.out.println("이름을 입력하세요.:");
            name = sc.nextLine();
            System.out.println("JAVA 점수를 입력하세요:");
            JAVA = sc.nextInt();
            System.out.println("SPRING 점수를 입력하세요 :");
            SPRING = sc.nextInt();
            System.out.println("JPA 점수를 입력하세요::");
            JPA = sc.nextInt();
            System.out.println("MYSQL 점수를 입력하세요:");
            MYSQL = sc.nextInt();
            System.out.println("DESIGNPATTERN 점수를 입력하세요:");
            DESIGNPATTERN = sc.nextInt();
            System.out.println("SPRINGSECURITY 점수를 입력하세요:");
            SPRINGSECURITY = sc.nextInt();
            System.out.println("REDIS 점수를 입력하세요:");
            REDIS = sc.nextInt();
            System.out.println("MONGODB 점수를 입력하세요:");
            MONGODB = sc.nextInt();


        }
    }

    //조회
    void serchInfo() {

        String find;    // 이름 받을 변수

        System.out.println("이름을 입력하세요:");
        find = sc.nextLine();

        for (int h = 0; h < list.size(); h++) {

            if (find.equals(list.get(h).getName())) {
                System.out.println("조회중입니다 잠시만 기다려 주세요");

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {

                }

                System.out.println("이름\tJAVA\tSPRING\tJPA\tMYSQL\tDESIGNPATTERN\tSPRINGSECURITY\tREDIS\tMONGODB");
                System.out.println(list.get(h).getName() + "\t" + list.get(h).getJAVA() + "\t" + list.get(h).getSPRING() + "\t" + list.get(h).getJPA() + "\t" + list.get(h).getMYSQL() + "\t" +
                        list.get(h).getDESIGNPATTERN() + "\t" + list.get(h).getSPRINGSECURITY() + "\t" + list.get(h).getREDIS() + "\t" + list.get(h).MONGODB);
            } else {
                System.out.println("이름을 다시 확인해주세요.");
            }
            break;
        }
    }

    //수정본
    public void check(ArrayList<Student> list) {
        this.list = list;
        for (int i = 0; i < list.size(); i++) {
            System.out.println("고유번호는" + list.get(i).getAccountId() + " " + "이고," + "이름은" + list.get(i).getName());
        }

        System.out.println("성적을 수정할 학생의 번호를 입력해주세요:");
        String check = sc.nextLine();
        int accountNum = Integer.parseInt(check);
        Student findStudent = checkPerson(accountNum);
        checkCourse(findStudent);
    }

    public Student checkPerson(int select) {
        for(int i = 0; i<list.size(); i++) {
            if(select == list.get(i).getAccountId()) {
                return list.get(i);
            }
        }
        return null;
    }

    public void checkCourse(Student findStudent) {
        findStudent.getMyCourse(i);
        List<Course> course = findStudent.getMyCourse();
        for (int i = 0; i < course.size(); i++) {
            System.out.println("학생이 수강하고 있는 과목은" + course.get(i).getCourseName()+"이고,"+ "코드번호는 "+course.get(i).getIdNumber()+ "입니다.");
        }
    }
    public Student checkSubject(int idNumber) {
        for(int i = 0; i<course.size(); i++) {
            if(idNumber == course.get(i).getIdNumber()) {
                return list.get(i);
            }
        }
        return null;
    }
    public void inputCourse(IdNumber idNumber) {
        idNumber.getIdNumber(i);
        List<idNumber>idNumber = idNumber.getMyIdNumber();

    }

}

// 고유번호를 가지고 고유번호를 입력해서
// 고유번호가 있는지 학생의 course를 위처럼 검색해서
// 있으면 코스타입으로 반환

// 점수를 입력하거나, 수정
//  public List<Grade> getGrades() 현재는 아무 것도 없다.
// 여기다가 점수를 넣으면 등급까지 설정하게끔 grade 클래스 안에
// grade , coursetype 두가지로
// set 으로
