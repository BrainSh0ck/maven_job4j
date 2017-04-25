package com.store;

/**
 * Base class.
 *
 * @author Vihovsky Roman
 * @since 23.04.2017
 */
public abstract class Base {
    /**
     * Name of unit.
     */
    private String name;
    /**
     * Role of unit.
     */
    private String role;
    /**
     *  Id of the unit.
     */
    private String id;
    /**
     * Default name constructor.
     *
     * @param name name
     * @param id id
     */
    public Base(String name, String id) {
        this.name = name;
        this.id = id;
    }
    /**
     * Default name constructor.
     *
     * @param role role
     * @param id id
     * @param mix key of overloading
     */
    public Base(String role, String id, int mix) {
        this.role = role;
        this.id = id;
    }

    /**
     *  Get user Id.
     * @return some id
     */
    String getid() {
        return this.id;
    }
    /**
     *  Id setter.
     * @param id some new Id
     */
    void setId(String id) {
    this.id = id;
    }
    /**
     *  Name getter.
     * @return name of the object
     */
    public String getName() {
        return this.name;
    }
    /**
     *  Role getter.
     * @return role of the object
     */
    public String getRole() {
        return this.role;
    }
}
