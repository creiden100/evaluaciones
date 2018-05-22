/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Crud_Estudiante {

    public Map<String, Integer> Map = new HashMap<>();

    public List<Estudiante> findAll() throws SQLException {
        List<Estudiante> departamentos = null;
        String query = "SELECT * FROM estudiante";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            String Nombre = null;
            String Genero = null;
            String Carrera = null;
            int Cedula_Estudiante;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Estudiante>();
                }

                Estudiante registro = new Estudiante();

                Nombre = rs.getString("nombre");
                registro.setNombre(Nombre);

                Genero = rs.getString("genero");
                registro.setGenero(Genero);

                Carrera = rs.getString("carrera");
                registro.setCarrera(Carrera);

                Cedula_Estudiante = rs.getInt("cedula_estudiante");
                registro.setCedula_Estudiante(Cedula_Estudiante);

                departamentos.add(registro);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Atletas");
            e.printStackTrace();
        }

        return departamentos;
    }

    
    public boolean insert(Estudiante t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into estudiante (nombre,genero,carrera,cedula_estudiante)" + "values (?,?,?,?)";
        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            preparedStmt.setString(2, t.getGenero());
            preparedStmt.setString(3, t.getCarrera());
            preparedStmt.setInt(4, t.getCedula_Estudiante());

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
