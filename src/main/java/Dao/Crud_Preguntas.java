/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.Preguntas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Crud_Preguntas {

    public Map<String, Integer> Map = new HashMap<>();

    public List<Preguntas> findAll() throws SQLException {
        List<Preguntas> departamentos = null;
        String query = "SELECT * FROM preguntas";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int Id_Preguntas;
            String Contenido = null;
            String Respuesta_Correcta = null;
            int Id_Examen;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Preguntas>();
                }

                Preguntas registro = new Preguntas();

                Id_Preguntas = rs.getInt("id_preguntas");
                registro.setId_Pregunta(Id_Preguntas);

                Contenido = rs.getString("contenido");
                registro.setContenido(Contenido);

                Respuesta_Correcta = rs.getString("respuesta_correcta");
                registro.setRespuesta_Correcta(Respuesta_Correcta);

                Id_Examen = rs.getInt("id_examen");
                registro.setId_Examen(Id_Examen);

                


                departamentos.add(registro);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Atletas");
            e.printStackTrace();
        }

        return departamentos;
    }

    public boolean insert(Preguntas t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into preguntas (contenido,respuesta_correcta,id_examen)" + "values (?,?,?)";
        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getContenido());
            preparedStmt.setString(2, t.getRespuesta_Correcta());
            preparedStmt.setInt(3, t.getId_Examen());

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean update(int id_examen,int id_preguntas) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " update preguntas SET id_examen=? where id_preguntas=?";
         
        PreparedStatement preparedStmt = null;
        try {

            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, id_examen);
            preparedStmt.setInt(2, id_preguntas);

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
