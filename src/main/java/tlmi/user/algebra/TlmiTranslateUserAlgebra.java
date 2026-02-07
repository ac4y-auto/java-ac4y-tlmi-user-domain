package tlmi.user.algebra;

import ac4y.base.domain.Ac4y;

import java.io.Serializable;

public class TlmiTranslateUserAlgebra extends Ac4y {

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
/*
    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }
*/
    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    int code;
    //int user;
    String humanName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String avatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    String language;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;

}