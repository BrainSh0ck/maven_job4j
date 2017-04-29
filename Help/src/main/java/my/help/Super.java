package my.help;

/**
 * Simple super class.
 *
 * @author Vihovsky Roman
 * @since 25.04.2017
 */
public class Super<T extends Child> {
    /**
     * getType.
     * @return type
     */
    public T getType() {
        return type;
    }
    /**
     * setType.
     * @param type type
     */
    public void setType(T type) {
        this.type = type;
    }

    /**
     * type.
     */
    private T type;
    /**
     * Name.
     */
    private String name;
    /**
     * Id.
     */
    private int id;
    /**
     *  getName.
     * @return String
     */
    public String getName() {
        return name;
    }
    /**
     *  setName.
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * getId.
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * setId.
     * @param id int
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * constructor.
     * @param name name
     * @param id id
     */
    public Super(String name, int id) {
        this.name = name;
        this.id = id;
    }
    /**
     * clean construct.
     */
    public Super() {
    }
}
