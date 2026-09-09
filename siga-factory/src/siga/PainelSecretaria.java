package siga;

public class PainelSecretaria implements Painel {
    @Override 
    public void montar() {
        System.out.println("=== Painel da Secretaria ===");
        System.out.println("- Matrícula de alunos");
        System.out.println("- Emissão de boletins");
        System.out.println("- Controle de frequência");
    }
 
}
