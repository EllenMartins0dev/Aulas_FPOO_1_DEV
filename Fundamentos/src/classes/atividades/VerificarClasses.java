/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class VerificarClasses {
    public static void main(String[] args) {
        System.out.println("---- Atividade Sala ----");
        Sala salaDEV = new Sala(32, 32, 01, true, 34, true);
        System.out.println(salaDEV);
        salaDEV.verificarArcondicionado();
        salaDEV.verificarProjetor();
        
        System.out.println("");
        
         Sala salaELE = new Sala(32, 32, 7, false, 1, true);
        System.out.println(salaELE);
        salaELE.verificarArcondicionado();
        salaELE.verificarProjetor();
         System.out.println("");
         
        System.out.println("---- Atividade Computador ----");
        Computador pcGustavo = new Computador(800, "windows", MemoriaEnum.DDR3_1.getTipoMemoria(), MemoriaEnum.DDR3_1.getQtdeMemoria(), ProcessadorEnum.INTELI7.getTipoProcessador());
        System.out.println("Computador Gustavo: " + pcGustavo);
        pcGustavo.verificarCapacidadeDR();
        pcGustavo.verificarSistemaOperaional();
        
        System.out.println("");
         Computador pcJoao = new Computador(500, "linux", MemoriaEnum.DDR2.getTipoMemoria(), MemoriaEnum.DDR2.getQtdeMemoria(), ProcessadorEnum.INTELI5.getTipoProcessador());
        System.out.println("Computador Joao: " + pcJoao);
        pcJoao.verificarCapacidadeDR();
        pcJoao.verificarSistemaOperaional();
        
        System.out.println("");
        Computador pcTeixeira = new Computador(1000, "ubuntu", MemoriaEnum.DDR3.getTipoMemoria(), MemoriaEnum.DDR3.getQtdeMemoria(), ProcessadorEnum.INTELI5.getTipoProcessador());
        System.out.println("Computador Teixeira: " + pcTeixeira);
        pcTeixeira.verificarCapacidadeDR();
        pcTeixeira.verificarSistemaOperaional();
       
        
        System.out.println("");
        System.out.println("---- Atividade Curso ----");
        Curso dev = new Curso("DEV", "Curso de programacao backend e frontend", CategoriaEnum.INFORMATICA.getCategoria());
        System.out.println(dev);
        dev.verificarCurso();
        dev.verificarDescricao();
        
        System.out.println("");
        Curso eletrica = new Curso("Eletrica", "Curso para aprender sobre eletricidade e fios (eletronicos e automacao de casas)", CategoriaEnum.ELETRICA.getCategoria());
        System.out.println(eletrica);
        eletrica.verificarCurso();
        eletrica.verificarDescricao();
        
        System.out.println("");
        Curso adm = new Curso("Administracao", "Curso para aprender sobre eadministracao", CategoriaEnum.ADMINISTRACAO.getCategoria());
        System.out.println(adm);
        adm.verificarCurso();
        adm.verificarDescricao();
    }
}
