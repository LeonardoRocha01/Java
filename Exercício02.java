public class Exercicios03 {
    public static void main(String[] args) {

        double saque, saldoAtual, saldoFinal, sobra, limite;
        saldoAtual = 1000;
        limite = 2000;
        saque = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer sacar"));
        saldoFinal = saldoAtual - saque;

        if (saldoFinal >= 0) {
            JOptionPane.showMessageDialog(null, "Seu saldo é positivo com R$ " + saldoFinal);
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem limite o suficiente, seu limite é de R$" + limite);
        }
    }
}

