/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.Estudiante;
import Datos.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JCBOT
 */
public class Crud_Usuarios {

    public Map<String, Integer> Map = new HashMap<>();

    public List<Usuarios> findAll() throws SQLException {
        List<Usuarios> departamentos = null;
        String query = "SELECT * FROM usuarios";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int cedula_profesor;
            int cedula_estudiante;
            String examenes = null;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Usuarios>();
                }

                Usuarios registro = new Usuarios();

                cedula_profesor = rs.getInt("cedula_profesor");
                registro.setCedula_profesor(cedula_profesor);

                cedula_estudiante = rs.getInt("cedula_estudiante");
                registro.setCedula_estudiante(cedula_estudiante);

                examenes = rs.getString("examenes");
                registro.setExamenes(examenes);

                departamentos.add(registro);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Atletas");
            e.printStackTrace();
        }

        return departamentos;
    }

    public boolean insert(Usuarios t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into usuarios (cedula_profesor,cedula_estudiante,examenes)" + "values (?,?,?)";
        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getCedula_profesor());
            preparedStmt.setInt(2, t.getCedula_estudiante());
            preparedStmt.setString(3, t.getExamenes());

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
