/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoFlor;
import javax.swing.JOptionPane;
import modelo.Flor;
import tela.manutencao.ManutencaoFlor;

/**
 *
 * @author Administrador
 */
public class ControladorFlor {

    public static void inserir(ManutencaoFlor man){
        Flor objeto = new Flor();
        objeto.setTamanho_da_setala(Double.parseDouble(man.jtfTamanhoDaSepala.getText()));
        objeto.setTamanho_da_petala(Double.parseDouble(man.jtfTamanhoDaPetala.getText()));
        objeto.setNome_cientifico(man.jtfNomeCientifico.getText());
        objeto.setNome_popular(man.jtfNomePopular.getText());
        objeto.setAno(Integer.parseInt(man.jtfAno.getText()));
        
        boolean resultado = DaoFlor.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

   public static void alterar(ManutencaoFlor man){
        Flor objeto = new Flor();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setTamanho_da_setala(Double.parseDouble(man.jtfTamanhoDaSepala.getText()));
        objeto.setTamanho_da_petala(Double.parseDouble(man.jtfTamanhoDaPetala.getText()));
        objeto.setNome_cientifico(man.jtfNomeCientifico.getText());
        objeto.setNome_popular(man.jtfNomePopular.getText());
        objeto.setAno(Integer.parseInt(man.jtfAno.getText()));
        
        boolean resultado = DaoFlor.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

     public static void excluir(ManutencaoFlor man){
        Flor objeto = new Flor();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); 
        
        boolean resultado = DaoFlor.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
