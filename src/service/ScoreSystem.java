package service;

import java.util.ArrayList;
import java.util.Scanner;
//최지원: 점수 등록 및 점수 수정 기능
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




