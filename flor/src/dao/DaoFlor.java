/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Flor;
/**
 *
 * @author Administrador
 */
public class DaoFlor {
     public static boolean inserir(Flor objeto) {
        String sql = "INSERT INTO flor (tamanho_da_setala, tamanho_da_petala, nome_cientifico, nome_popular, ano) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, objeto.getTamanho_da_setala());
            ps.setDouble(2, objeto.getTamanho_da_petala());
            ps.setString(3, objeto.getNome_cientifico());
            ps.setString(4, objeto.getNome_popular());
            ps.setInt(5, objeto.getAno());
            ps.executeUpdate();
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      public static void main(String[] args) {
        Flor objeto = new Flor();
        objeto.setTamanho_da_setala(1.0);
        objeto.setTamanho_da_petala(4.0);
        objeto.setNome_cientifico("hydragea");
        objeto.setNome_popular("Hortencia");
        objeto.setAno(2003);
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
       public static boolean alterar(Flor objeto) {
        String sql = "UPDATE flor SET tamanho_da_setala = ?, tamanho_da_petala = ?,  nome_cientifico = ?, nome_popular = ?, ano = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, objeto.getTamanho_da_setala());
            ps.setDouble(2, objeto.getTamanho_da_petala());
            ps.setString(3, objeto.getNome_cientifico());
            ps.setString(4, objeto.getNome_popular());
            ps.setInt(5, objeto.getAno());
            ps.setInt(6, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
public static boolean excluir(Flor objeto) {
        String sql = "DELETE FROM flor WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
