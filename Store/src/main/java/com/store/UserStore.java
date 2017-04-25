package com.store;

/**
 * UserStore class.
 *
 * @author Vihovsky Roman
 * @since 23.04.2017
 */
public class UserStore extends MainStore<User>  {
    /**
     * Default constructor.
     *
     * @param size size of initilized container
     */
    public UserStore(int size) {
        super(size);
    }
}
