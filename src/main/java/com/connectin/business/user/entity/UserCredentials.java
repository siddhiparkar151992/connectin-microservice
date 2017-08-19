package com.connectin.business.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usr_auth")
public class UserCredentials implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "password")
    private String password;

    @Column(name = "last_logged_in")
    private Date lastLoogedIn;

    /**
     *
     */
    public UserCredentials() {

    }


    /**
     * @param userName
     * @param password
     */
    public UserCredentials(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;
    }

    /**
     * @param userName
     * @param userId
     * @param password
     * @param lastLoogedIn
     */
    public UserCredentials(String userName, int userId, String password, Date lastLoogedIn) {
        super();
        this.userName = userName;
        this.userId = userId;
        this.password = password;
        this.lastLoogedIn = lastLoogedIn;
    }


    /**
     * @param id
     * @param userName
     * @param password
     * @param lastLoogedIn
     */
    public UserCredentials(int id, String userName, String password, Date lastLoogedIn) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.lastLoogedIn = lastLoogedIn;
    }
    
    public UserCredentials(String userName, String password, Date lastLoogedIn) {
        super();
        this.userName = userName;
        this.password = password;
        this.lastLoogedIn = lastLoogedIn;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "UserCredentials [id=" + id + ", userName=" + userName + ", password=" + password + ", lastLoogedIn="
                + lastLoogedIn + "]";
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the lastLoogedIn
     */
    public Date getLastLoogedIn() {
        return lastLoogedIn;
    }

    /**
     * @param lastLoogedIn the lastLoogedIn to set
     */
    public void setLastLoogedIn(Date lastLoogedIn) {
        this.lastLoogedIn = lastLoogedIn;
    }


}
