package service;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreSystem {
    String name;
    int JAVA;
    int SPRING;
    int JPA;
    int MYSQL;
    int DESIGNPATTERN;
    int SPRINGSECURITY;
    int REDIS;
    int MONGODB;

    // 생성자
    public ScoreSystem() {

    }

    public ScoreSystem(String name, int JAVA, int SPRING, int JPA, int MYSQL, int DESIGNPATTERN, int SPRINGSECURITY, int REDIS, int MONGODB) {
        this.name = name;
        this.JAVA = JAVA;
        this.SPRING = SPRING;
        this.JPA = JPA;
        this.MYSQL = MYSQL;
        this.DESIGNPATTERN = DESIGNPATTERN;
        this.REDIS = REDIS;
        this.MONGODB = MONGODB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJAVA() {
        return JAVA;
    }

    public void setJAVA(int JAVA) {
        this.JAVA = JAVA;
    }

    public int getSPRING() {
        return SPRING;
    }

    public void setSPRING(int SPRING) {
        this.SPRING = SPRING;
    }

    public int getJPA() {
        return JPA;
    }

    public void setJPA(int JPA) {
        this.JPA = JPA;
    }

    public int getMYSQL() {
        return MYSQL;
    }

    public void setMYSQL(int MYSQL) {
        this.MYSQL = MYSQL;
    }

    public int getDESIGNPATTERN() {
        return DESIGNPATTERN;
    }

    public void setDESIGNPATTERN(int DESIGNPATTERN) {
        this.DESIGNPATTERN = DESIGNPATTERN;
    }

    public int getSPRINGSECURITY() {
        return SPRINGSECURITY;
    }

    public void setSPRINGSECURITY(int SPRINGSECURITY) {
        this.SPRINGSECURITY = SPRINGSECURITY;
    }

    public int getREDIS() {
        return REDIS;
    }

    public void setREDIS(int REDIS) {
        this.REDIS = REDIS;
    }

    public int getMONGODB() {
        return MONGODB;
    }

    public void setMONGODB(int MONGODB) {
        this.MONGODB = MONGODB;
    }
}


class ScoreInformation {

    ArrayList<ScoreSystem> list;    //arraylist 생성 (클래스가 배열에 담기게 된다 )
    Scanner sc;
    private String id, name;
    private int JAVA, SPRING, JPA, MYSQL, DESIGNPATTERN, SPRINGSECURITY, REDIS, MONGODB;
    ScoreInformation Scoreinformation;

    void insert() {
        int stu_Num;
        System.out.println("몇명의 학생을 입력하시겠습니까?:");
        stu_Num = sc.nextInt();    //값 입력 받음

        for (int i = 0; i < stu_Num; i++) {        //입력 받은 수만큼 반복문

            //값 입력 부분
            System.out.println("학번을 입력하세요:");
            id = sc.next();
            System.out.println("이름을 입력하세요.:");
            name = sc.next();
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
        find = sc.next();

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

    //수정
    public void modify() {
        String modi;
        System.out.println("성적을 수정할 이름을 입력하세요:");
        modi = sc.next();
        int select;

        for (int j = 0; j < list.size(); j++) {
            if (modi.equals(modi.equals(list.get(j).getName()))) {
                System.out.println("수정할 부분을 선택해주세요 1.일괄수정 2.이름 3.JAVA 4.SPRING 5.JPA 6.MYSQL 7.DESIGNPATTERN 8.SPRINGSECURITY 9.REDIS 10.MONGODB:");
                select = sc.nextInt();

                if (select == 1) {
                    System.out.println("변경할 이름을 입력하세요:");
                    list.get(j).setName(sc.next());
                    System.out.println("변경할 JAVA점수를입력하세요:");
                    list.get(j).setJAVA(Integer.parseInt(sc.next()));
                    System.out.println("변경할 SPRING점수를 입력하세요:");
                    list.get(j).setSPRING(Integer.parseInt(sc.next()));
                    System.out.println("변경할 JPA점수를 입력하세요:");
                    list.get(j).setJPA(Integer.parseInt(sc.next()));
                    System.out.println("변경할 MYSQL점수를 입력하세요:");
                    list.get(j).setMYSQL(Integer.parseInt(sc.next()));
                    System.out.println("변경할 DESIGNPATTERN점수를입력하세요:");
                    list.get(j).setDESIGNPATTERN(Integer.parseInt(sc.next()));
                    System.out.println("변경할 SPRINGSECURITY점수를 입력하세요:");
                    list.get(j).setSPRINGSECURITY(Integer.parseInt(sc.next()));
                    System.out.println("변경할 REDIS점수를 입력하세요:");
                    list.get(j).setREDIS(Integer.parseInt(sc.next()));
                    System.out.println("변경할 MONGODB점수를 입력하세요:");
                    list.get(j).setMONGODB(Integer.parseInt(sc.next()));

                    System.out.println("수정이 완료되었습니다.\n");
                    System.out.println("이름\tJAVA\tSPRING\tJPA\tMYSQL\tDESIGNPATTERN\tSPRINGSECURITY\tREDIS\tMONGODB");
                    System.out.println(
                            list.get(j).getName() + "\t" + list.get(j).getJAVA() + "\t" + list.get(j).getSPRING() + "\t" + list.get(j).getJPA() + "\t" + list.get(j).getMYSQL() + "\t" +
                                    list.get(j).getDESIGNPATTERN() + "\t" + list.get(j).getSPRINGSECURITY() + "\t" + list.get(j).getREDIS() + "\t" + list.get(j).MONGODB);
                }
                break;
            }
        }
    }
}




