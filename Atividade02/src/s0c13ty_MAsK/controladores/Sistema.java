package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.models.BigBrothers;
import s0c13ty_MAsK.models.HeavyLifters;
import s0c13ty_MAsK.models.MobileMembers;
import s0c13ty_MAsK.models.ScriptGuys;

/**
 * Classe onde sera executado a implementacao
 */
public class Sistema {
    public static void main(String[] args) {

        // registrar membros
        // informar quando perguntado o horario
        // postar msg para todos os membros
        // chamada de relatorio -> apresentacao

        horarioatual = Horario.NORMAL;

        BigBrothers c1 = new BigBrothers("Daniel", "danigatinho@gmail.com",5578, TiposDeMembro.Big_Brothers);

        System.out.println("Bem vindo ao sistema da MAsK_s0c13ty");
        System.out.println("Seu horário atual é:" + horarioatual);
        System.out.println("Deseja mudar seu horário atual?\n +
                "1 - sim \n +
                "2 - nao");
        int resp = Integer.parseInt(scanner.next());
        if (resp == 1) {
            horarioatual = Horario.EXTRA;
            System.out.println("Seu horário foi alterado com sucesso!");
        }
        if (resp == 2) {
            System.out.println("Seu horario ainda é: " + horarioatual);
        }
        else{
            System.out.println("Digite um número entre um dos apresentados acima.");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu tipo de usuário? Digite o número respectivo\n +
                "0 - Encerrar o programa\n +
                "1 - Mobile Members\n +
                "2 - Heavy Lifters\n +
                "3 - Script Guys \n +
                "4 - Big Brothers");
        Scanner scan = new Scanner(System.in);

        int opcao = Integer.parseInt(scanner.next());

        if (opcao == 0){
            System.out.println("Sistema Encerrado.")
            break;
        }
        if (opcao == 1){
            public void postarMensagem(Horario horario);
            public void apresentacao();
        }
        if (opcao == 2){
            public void postarMensagem(Horario horario);
            public void apresentacao();
        }
        if (opcao == 3){
            public void postarMensagem(Horario horario);
            public void apresentacao();
        }
        if (opcao == 4){
            public void postarMensagem(Horario horario);
            public void apresentacao();
            c1.cadastroMembros();
        }
        else{
            System.out.println("Digite um número entre um dos apresentados acima.")
        }
    }
}
