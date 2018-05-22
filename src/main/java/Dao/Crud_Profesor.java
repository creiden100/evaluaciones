/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.Profesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Crud_Profesor {

    public Map<String, Integer> Map = new HashMap<>();

    public List<Profesor> findAll() throws SQLException {
        List<Profesor> departamentos = null;
        String query = "SELECT * FROM profesor";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            String Nombre = null;
            String Genero = null;
            String Profesion = null;
            int Cedula_Profesor;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Profesor>();
                }

                Profesor registro = new Profesor();

                Nombre = rs.getString("nombre");
                registro.setNombre(Nombre);

                Genero = rs.getString("genero");
                registro.setGenero(Genero);

                Profesion = rs.getString("profesion");
                registro.setProfesion(Profesion);

                Cedula_Profesor = rs.getInt("cedula_profesor");
                registro.setCedula_Profesor(Cedula_Profesor);

                departamentos.add(registro);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Atletas");
            e.printStackTrace();
        }

        return departamentos;
    }

    
    
    
    public boolean insert(Profesor t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into profesor (nombre,genero,profesion,cedula_profesor)" + "values (?,?,?,?)";
        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            preparedStmt.setString(2, t.getGenero());
            preparedStmt.setString(3, t.getProfesion());
            preparedStmt.setInt(4, t.getCedula_Profesor());

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
