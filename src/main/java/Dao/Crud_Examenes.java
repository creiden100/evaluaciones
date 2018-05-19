/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.Examenes;
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
public class Crud_Examenes {

    public Map<String, Integer> Map = new HashMap<>();

    public List<Examenes> findAll() throws SQLException {
        List<Examenes> departamentos = null;
        String query = "SELECT * FROM examenes";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int Id_examenes;
            String Nombre = null;
            int Cedula_Profesor;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Examenes>();
                }

                Examenes registro = new Examenes();

                Id_examenes = rs.getInt("id_examenes");
                registro.setId_examen(Id_examenes);

                Nombre = rs.getString("nombre");
                registro.setNombre(Nombre);

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
    
    

    public boolean insert(Examenes t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into examenes (nombre,cedula_profesor)" + "values (?,?)";
        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            preparedStmt.setInt(2, t.getCedula_Profesor());

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
