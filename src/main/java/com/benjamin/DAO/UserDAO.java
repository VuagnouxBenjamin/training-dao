package com.benjamin.DAO;

import com.benjamin.Entities.User;
import com.mysql.cj.xdevapi.Client;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends Database{
    public UserDAO() { }

    public void insert(User user) {
        try {
            PreparedStatement stm = con.prepareStatement("INSERT INTO user (email, password, first_name, last_name, phone_number, shipping_address, billing_address) VALUES (?,?,?,?,?,?,?)");
            stm.setString(1, user.getEmail());
            stm.setString(2, user.getPassword());
            stm.setString(3, user.getFirst_name());
            stm.setString(4, user.getLast_name());
            stm.setString(5, user.getPhone_number());
            stm.setString(6, user.getShipping_address());
            stm.setString(7, user.getBilling_address());

            stm.execute();

            stm.close();
            con.close();
            System.out.println("succès(UserDAO): l'insertion s’est effectuée avec succès");

        } catch (SQLException e) {
            System.out.println("Erreur(UserDAO): Problème dans l'insertion de l'utilisateur");
            e.printStackTrace();
        }
    }

    public void update(User user) {
        // methode
    }

    public void delete(User user) {
        // methode
    }

    public void find(int id) {
        // methode
    }

    public List<Client> list() {
        // methode
        return new ArrayList<Client>();
    }
}
