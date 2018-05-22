/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.Examenes;
import Datos.Resultados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Crud_Resultados {

    public Map<String, Integer> Map = new HashMap<>();

    public List<Resultados> findAll() throws SQLException {
        List<Resultados> departamentos = null;
        String query = "SELECT * FROM resultados";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int id_resultados;
            int id_examenes;
            int puntaje;
            int cedula_estudiante;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Resultados>();
                }

                Resultados registro = new Resultados();

                id_resultados = rs.getInt("id_resultados");
                registro.setId_resultados(id_resultados);

                id_examenes = rs.getInt("id_examenes");
                registro.setId_examenes(id_examenes);
                
                puntaje = rs.getInt("puntaje");
                registro.setPuntaje(puntaje);

                cedula_estudiante = rs.getInt("cedula_estudiante");
                registro.setCedula_estudiante(cedula_estudiante);

                departamentos.add(registro);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Atletas");
            e.printStackTrace();
        }

        return departamentos;
    }

    public boolean insert(Resultados t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into resultados (id_examenes,puntaje,cedula_estudiante)" + "values (?,?,?)";
        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getId_examenes());
            preparedStmt.setInt(2, t.getPuntaje());
            preparedStmt.setInt(3, t.getCedula_estudiante());

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
