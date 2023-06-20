import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MainUniversidade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Professor> listaProfessores = new ArrayList<>();
        List<Estagiario> listaEstagiarios = new ArrayList<>();
        List<Coordenador> listaCoordenadores = new ArrayList<>();
        List<FuncAdm> listaFuncADM = new ArrayList<>();

        String nome, cpf, nivelGraduacao, disciplinaMinistrada, orgaoLotacao, funcaoAdministrativa, senioridade;
        int numRegistro;
        double salario;

        // Testando classe professor
        listaProfessores.add(new Professor("Joao", "000.000.000-00", 1, "ADM",
                7000, "Doutor", "Cálculo I"));
        listaProfessores.add(new Professor("Victor", "000.000.000-00", 2, "ADM",
                8000, "Doutor", "Cálculo I"));
        listaProfessores.add(new Professor("Silva", "000.000.000-00", 3, "ADM",
                9000, "Doutor", "Cálculo I"));

        // Testando classe estagiário
        listaEstagiarios.add(new Estagiario("AAA", "000.000.000-00", 5, "ADM",
                700));
        listaEstagiarios.add(new Estagiario("BBB", "000.000.000-00", 6, "ADM",
                800));
        listaEstagiarios.add(new Estagiario("CCC", "000.000.000-00", 7, "ADM",
                900));

        // Testando classe Funcionário Administrativo
        listaFuncADM.add(new FuncAdm("DDD", "000.000.000-00", 1, "ADM",
                7000, "Dev", "Júnior"));
        listaFuncADM.add(new FuncAdm("EEE", "000.000.000-00", 1, "ADM",
                7000, "Dev", "Pleno"));
        listaFuncADM.add(new FuncAdm("FFF", "000.000.000-00", 1, "ADM",
                7000, "Dev", "Senior"));

        // Testando classe Coordenador
        listaCoordenadores.add(new Coordenador("Joao", "000.000.000-00", 1, "ADM",
                7000.0));
        listaCoordenadores.add(new Coordenador("Joao", "000.000.000-00", 1, "ADM",
                7000.0));
        listaCoordenadores.add(new Coordenador("Joao", "000.000.000-00", 1, "ADM",
                7000.0));

        System.out.println("----- Menu ------");
        System.out.println("1. Coordenador\n2. Professor\n3. Funcionário Administrativo\n4. Estagiário\n5. Sair");
        System.out.println("Digite a opção: ");
        int opcao = sc.nextInt();
        limparConsole();

        boolean menuPrincipal = false;
        while (opcao != 5){
            switch (opcao) {
                case 1:
                    System.out.println("2. Visualizar Coordenadores");
                    imprimirLista(listaCoordenadores);
                    System.out.println("\nDigite o * Índice do Coord. * que você deseja alterar: ");
                    int coordSelect = sc.nextInt();
                    limparConsole();
                    System.out.println("1. Exibir Informações Completas\n2. Aumentar salário\n3. Reembolsar despesas\n4. Adicionar professor supervisionado\n5. Remover professor supervisionado");
                    System.out.println("Digite a opção: ");
                    int op = sc.nextInt();
                    limparConsole();
                    if (op == 1){
                        listaCoordenadores.get(coordSelect).exibirInformacoesComplestas();
                        digitarEnter();
                    } else if (op == 2) {
                        listaCoordenadores.get(coordSelect).aumentarSalario();
                        System.out.println("Salário aumentado com sucesso!");
                        digitarEnter();
                    } else if (op == 3) {
                        System.out.println("Digite o valor da despesa: ");
                        listaCoordenadores.get(coordSelect).reembolsarDespesas(sc.nextDouble());
                        System.out.println("Despesas reembolsadas!");
                        digitarEnter();
                    } else if (op == 4) {
                        sc.nextLine();
                        Professor profAdd = criarProfessor();
                        listaCoordenadores.get(coordSelect).adicionarProfessor(profAdd);
                        limparConsole();
                        System.out.println("Professor supervisionado adicionado com sucesso!");
                        System.out.println("Lista dos professores supervisionados: ");
                        System.out.println(listaCoordenadores.get(coordSelect).getProfessoresSupervisionados());
                        digitarEnter();
                    } else if (op == 5) {
                        System.out.println("Digite qual professor você deseja remover: ");
                        int profRemove = sc.nextInt();
                        listaCoordenadores.remove(profRemove);
                        digitarEnter();
                    }
                    break;
                case 2:
                    System.out.println("2. Visualizar Professores");
                    imprimirLista(listaProfessores);
                    System.out.println("\nDigite o * Índice do Prof. * que você deseja alterar: ");
                    int profSelect = sc.nextInt();
                    limparConsole();
                    System.out.println("1. Exibir Informações Completas\n2. Aumentar salário\n3. Reembolsar despesas\n4. Adicionar Estagiário\n5. Remover Turma");
                    System.out.println("Digite a opção: ");
                    op = sc.nextInt();
                    limparConsole();
                    if (op == 1){
                        listaProfessores.get(profSelect).exibirInformacoesComplestas();
                        digitarEnter();
                    } else if (op == 2) {
                        listaProfessores.get(profSelect).aumentarSalario();
                        System.out.println("Salário aumentado com sucesso!");
                        digitarEnter();
                    } else if (op == 3) {
                        System.out.println("Digite o valor da despesa: ");
                        listaCoordenadores.get(profSelect).reembolsarDespesas(sc.nextDouble());
                        System.out.println("Despesas reembolsadas!");
                        digitarEnter();
                    } else if (op == 4) {
                        sc.nextLine();
                        Estagiario EstagAdd = criarEstagiario();
                        listaProfessores.get(profSelect).adicionarEstagiario(EstagAdd);
                        imprimirLista(listaProfessores);
                        digitarEnter();
                    } else if (op == 5) {
                        Turma turmaAdd = criarTurma();
                        listaProfessores.get(profSelect).adicionarTurma(turmaAdd);
                        imprimirLista(listaProfessores);
                        digitarEnter();
                    }
                    break;
                case 3:
                    System.out.println("3. Visualizar Funcionários Administrativos");
                    imprimirLista(listaFuncADM);
                    System.out.println("\nDigite o * Índice Funcionário Adm * que você deseja alterar: ");
                    int funcAdmSelect = sc.nextInt();
                    limparConsole();
                    System.out.println("1. Exibir Informações Completas\n2. Aumentar salário\n3. Reembolsar despesas");
                    System.out.println("Digite a opção: ");
                    op = sc.nextInt();
                    limparConsole();
                    if (op == 1){
                        listaFuncADM.get(funcAdmSelect).exibirInformacoesComplestas();
                        digitarEnter();
                    }else if (op == 2) {
                        listaFuncADM.get(funcAdmSelect).aumentarSalario();
                        System.out.println("Salário aumentado com sucesso!");
                        digitarEnter();
                    } else if (op == 3) {
                        System.out.println("Digite o valor da despesa: ");
                        listaFuncADM.get(funcAdmSelect).reembolsarDespesas(sc.nextDouble());
                        System.out.println("Despesas reembolsadas!");
                        digitarEnter();
                    }
                    break;
                case 4:
                    System.out.println("4. Visualizar Estagiários");
                    imprimirLista(listaEstagiarios);
                    System.out.println("\n Selecione o * Estagiário * que você deseja alterar: ");
                    int estagSelect = sc.nextInt();
                    limparConsole();
                    System.out.println("1. Exibir Informações Completas\n2. Aumentar bolsa\n3. Reembolsar despesas\n");
                    System.out.println("Digite a opção: ");
                    op = sc.nextInt();
                    limparConsole();
                    if (op == 1){
                        listaEstagiarios.get(estagSelect).exibirInformacoesComplestas();
                        digitarEnter();
                    }else if (op == 2) {
                        listaEstagiarios.get(estagSelect).aumentarBolsa();
                        System.out.println("Bolsa aumentada com sucesso!");
                        digitarEnter();
                    } else if (op == 3) {
                        System.out.println("Digite o valor da despesa: ");
                        listaEstagiarios.get(estagSelect).reembolsarDespesas(sc.nextDouble());
                        System.out.println("Despesas reembolsadas!");
                        digitarEnter();
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("1. Exibir Informações Completas\n2. Aumentar salário\n3. Reembolsar despesas\n4. Adicionar Estagiário\n5. Remover Turma");
                    System.out.println("Opção não existe!\nDigite novamente:");
                    opcao = sc.nextInt();
                    limparConsole();
                    break;
            }
        }

    }

    public static void imprimirLista(List<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Nº Índice: " + (i+1) + " | " + list.get(i).toString());
        }
    }

    public static Professor criarProfessor() {
        Scanner sc = new Scanner(System.in);
        String nome, cpf, orgaoLotacao, nivelGraduacao, disciplinaMinistrada;
        int numRegistro;
        double salario;

        System.out.println("Digite as informações do professor para adicionar:");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("CPF: ");
        cpf = sc.nextLine();
        System.out.print("Número de Registro: ");
        numRegistro = sc.nextInt();
        sc.nextLine();
        System.out.print("Órgão de Lotação: ");
        orgaoLotacao = sc.nextLine();
        System.out.print("Salário: ");
        salario = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nível de Graduação: ");
        nivelGraduacao = sc.nextLine();
        System.out.print("Disciplina Ministrada: ");
        disciplinaMinistrada = sc.nextLine();

        Professor profAdd = new Professor(nome, cpf, numRegistro, orgaoLotacao, salario, nivelGraduacao, disciplinaMinistrada);
        return profAdd;
    }

    public static Estagiario criarEstagiario() {
        Scanner sc = new Scanner(System.in);
        String nome, cpf, orgaoLotacao;
        int numRegistro;
        double bolsa;

        System.out.println("Digite as informações do professor para adicionar:");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("CPF: ");
        cpf = sc.nextLine();
        System.out.print("Número de Registro: ");
        numRegistro = sc.nextInt();
        sc.nextLine();
        System.out.print("Órgão de Lotação: ");
        orgaoLotacao = sc.nextLine();
        System.out.print("Salário: ");
        bolsa = sc.nextDouble();

        Estagiario estagAdd = new Estagiario(nome, cpf, numRegistro, orgaoLotacao, bolsa);
        return estagAdd;
    }

    public static Turma criarTurma() {
        Scanner sc = new Scanner(System.in);
        String codigoTurma;
        int qtdAlunos;
        System.out.println("Digite as informações da turma para adicionar:");
        System.out.print("Código da turma: ");
        codigoTurma = sc.nextLine();
        System.out.print("Quantidade de alunos: ");
        qtdAlunos = sc.nextInt();

        Turma turmaAdd = new Turma(codigoTurma, qtdAlunos);

        return turmaAdd;
    }

    public static void limparConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void digitarEnter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nDigite * Enter * para retornar ao menu anterior");
        sc.nextLine();
    }
}
