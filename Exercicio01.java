public class Exercicios01 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
        // meses e dias e mostre-a expressa apenas em dia.
        int anos,meses,dias;
        int idadeEmDias;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade em anos: ");
        anos = leitor.nextInt();
        System.out.println("Digite a idade em meses: ");
        meses = leitor.nextInt();
        System.out.println("Digite a idade em dias: ");
        dias = leitor.nextInt();
        idadeEmDias = anos * 365 + meses * 30 + dias;
        System.out.println("Idade em dias: " + idadeEmDias);
