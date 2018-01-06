package indi.cc.proxyPattern;

/**
 * Author : CharlesChen
 * Time : 2018-01-04 14:13
 * Version : 1.0
 */
public class PersonBeanImpl implements PersonBean{
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterestes() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        return ratingCount == 0 ? 0 : rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
