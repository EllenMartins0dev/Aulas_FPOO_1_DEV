/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public interface ValidaPessoa {
    boolean verificarDominioEmailGmail(String email);
    boolean verificarDominioEmailYahoo(String email);
    boolean verificarDominioEmailHotmail(String email);
    boolean verificarDedicacaoExclusiva(boolean dedicacaoExclusiva);
}
