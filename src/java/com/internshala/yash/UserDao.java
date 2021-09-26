package com.internshala.yash;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    //get user by user email and password
    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;

        try {
            String query = "select * from user where email=? and password=?;";

            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1, email);
            pstmt.setString(2, password);

            ResultSet set = pstmt.executeQuery();

            if (set.next()) {
                user = new User();

                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    // update in database
    public boolean updateUser(User user) {
        boolean f = false;
        try {

            String query = "update user set file=? where id=?;";

            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1, user.getFileName());
            pstmt.setInt(2, user.getId());

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }

}
