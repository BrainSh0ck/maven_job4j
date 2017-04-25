package com.store.test;

import com.store.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Store package test class.
 *
 * @author Vihovsky Roman
 * @since 25.04.2017
 */
public class MainStoreTest {
    /**
     * Store<T> get test method.
     *
     * @throws Exception any exceptions
     */
    @Test
    public void getTestMethod() throws Exception {
        Store<User> users = new UserStore(10);
        User user1 = new User("Roman", "1");
        User user2 = new User("Oleg", "2");
        User user3 = new User("Arsenii", "3");
        Store<Role> roles = new RoleStore(10);
        Role role1 = new Role("user", "1");
        Role role2 = new Role("admin", "2");
        Role role3 = new Role("developer", "3");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        roles.add(role1);
        roles.add(role2);
        roles.add(role3);
        assertThat(users.get("1"), is(user1));
        assertThat(roles.get("1"), is(role1));
        assertThat(users.get("2"), is(user2));
        assertThat(roles.get("2"), is(role2));
        assertThat(users.get("3"), is(user3));
        assertThat(roles.get("3"), is(role3));
    }
    /**
     * Store<T> add test method.
     *
     * @throws Exception any exceptions
     */
    @Test
    public void addTestMethod() throws Exception {
        Store<User> users = new UserStore(10);
        User user1 = new User("Roman", "1");
        User user2 = new User("Oleg", "2");
        User user3 = new User("Arsenii", "3");
        Store<Role> roles = new RoleStore(10);
        Role role1 = new Role("user", "1");
        Role role2 = new Role("admin", "2");
        Role role3 = new Role("developer", "3");
        assertThat(users.add(user1), is(true));
        assertThat(roles.add(role1), is(true));
        assertThat(users.add(user2), is(true));
        assertThat(roles.add(role2), is(true));
        assertThat(users.add(user3), is(true));
        assertThat(roles.add(role3), is(true));
    }
    /**
     * Store<T> delete test method.
     *
     * @throws Exception any exceptions
     */
    @Test
    public void deleteTestMethod() throws Exception {
        Store<User> users = new UserStore(10);
        User user1 = new User("Roman", "1");
        User user2 = new User("Oleg", "2");
        User user3 = new User("Arsenii", "3");
        Store<Role> roles = new RoleStore(10);
        Role role1 = new Role("user", "1");
        Role role2 = new Role("admin", "2");
        Role role3 = new Role("developer", "3");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        roles.add(role1);
        roles.add(role2);
        roles.add(role3);
        users.delete("1");
        roles.delete("1");
        assertThat(users.get("1"), nullValue());
        assertThat(roles.get("1"), nullValue());
        assertThat(users.get("2"), notNullValue());
        assertThat(roles.get("2"), notNullValue());
        assertThat(users.get("3"), notNullValue());
        assertThat(roles.get("3"), notNullValue());
    }
    /**
     * Store<T> update test method.
     *
     * @throws Exception any exceptions
     */
    @Test
    public void updateTestMethod() throws Exception {
        Store<User> users = new UserStore(10);
        User user1 = new User("Roman", "1");
        User user2 = new User("Oleg", "2");
        User user3 = new User("Arsenii", "3");
        Store<Role> roles = new RoleStore(10);
        Role role1 = new Role("user", "1");
        Role role2 = new Role("admin", "2");
        Role role3 = new Role("developer", "3");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        roles.add(role1);
        roles.add(role2);
        roles.add(role3);
        users.update(new User("Mark", "3"), "3");
        roles.update(new Role("webdev", "3"), "3");
        assertThat(users.get("1"), is(user1));
        assertThat(roles.get("1"), is(role1));
        assertThat(users.get("2"), is(user2));
        assertThat(roles.get("2"), is(role2));
        assertThat(users.get("3"), not(user3));
        assertThat(roles.get("3"), not(role3));
    }
}