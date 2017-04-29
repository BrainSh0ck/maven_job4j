package my.help;

/**
 * Child class.
 *
 * @author Vihovsky Roman
 * @since 25.04.2017
 */
public class Child extends Super {
    /**
     * jade.
     */
    private String fade;
    /**
     * constructor.
     * @param name name
     * @param id id
     */
    public Child(String name, int id) {
    super(name, id);
    }
    /**
     * clean constructor.
     */
    public Child() {

    }
    /**
     * childPublic.
     */
    public void childPublic() {
        System.out.println("!");
    }
    /**
     *  getFade.
     * @return fate
     */
    public String getFade() {
        return fade;
    }
    /**
     * setFade.
     * @param fade String
     */
    public void setFade(String fade) {
        this.fade = fade;
    }


}
