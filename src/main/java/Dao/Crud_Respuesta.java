/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.Estudiante;
import Datos.Respuestas;
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
public class Crud_Respuesta {

    public Map<String, Integer> Map = new HashMap<>();

    public List<Respuestas> findAll() throws SQLException {
        List<Respuestas> departamentos = null;
        String query = "SELECT * FROM respuestas";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int Id_Respuesta;
            String Contenido = null;
            int Id_Preguntas;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Respuestas>();
                }

                Respuestas registro = new Respuestas();

                Id_Respuesta = rs.getInt("id_respuestas");
                registro.setId_Respuesta(Id_Respuesta);

                Contenido = rs.getString("contenido");
                registro.setContenido(Contenido);

                Id_Preguntas = rs.getInt("id_preguntas");
                registro.setId_pregunta(Id_Preguntas);

                departamentos.add(registro);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Atletas");
            e.printStackTrace();
        }

        return departamentos;
    }

    
    
    
    public boolean insert(Respuestas t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into respuestas (contenido,id_preguntas)" + "values (?,?)";
        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getContenido());
            preparedStmt.setInt(2, t.getId_pregunta());

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
