package jp.gihyo.jenkinsbook.dto;

import java.io.Serializable;

/**
 * DTO class for SampleServlet.
 */
public class SampleDTO implements Serializable {
    /**
     * First name of the user.
     */
    private String firstName;
    /**
     * Last name of the user.
     */
    private String lastName;
    /**
     * Greeting message.
     */
    private String message;

    /**
     * Store the user name.
     * @param fName first name of the user
     * @param lName last name of the user
     */
    public SampleDTO(final String fName, final String lName) {
        this.setFirstName(fName);
        this.setLastName(lName);
        this.setMessage("Hello");
    }

    /**
     * Get first name of the user.
     * @return first name of the user
     */
    public final String getFirstName() {
        return this.firstName;
    }

    /**
     * Get last name of the user.
     * @return last name of the user
     */
    public final String getLastName() {
        return this.lastName;
    }

    /**
     * Get greeting message.
     * @return greeting message
     */
    public final String getMessage() {
        return this.message;
    }

    /**
     * Set first name of the user.
     * @param fiName first name of the user
     */
    public final void setFirstName(final String fiName) {
        this.firstName = fiName;
    }

    /**
     * Set last name of the user.
     * @param laName last name of the user
     */
    public final void setLastName(final String laName) {
        this.lastName = laName;
    }

    /**
     * Set greeting message.
     * @param msg greeting message
     */
    public final void setMessage(final String msg) {
        this.message = msg;
    }
}
