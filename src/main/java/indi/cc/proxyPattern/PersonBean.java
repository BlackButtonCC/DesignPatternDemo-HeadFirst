package indi.cc.proxyPattern;

/**
 * Author : CharlesChen
 * Time : 2018-01-04 14:11
 * Version : 1.0
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterestes();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
