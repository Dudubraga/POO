package Aula06ArraysEFuncoes.Atividade06;

public class questao02 {
    public static void extenso(int dia, int mes, int ano){
        String[] meses = {"janeiro", "fevereiro", "março", "abril",
            "maio", "junho", "julho", "agosto", "setembro", "outubro",
            "novembro", "dezembro"};
        System.out.println(dia + " de " + meses[mes-1] + " de " + ano);
    }
    public static void main(String[] args) {
        String data = "28/07/2004";
        String[] separada = data.split("/");
        int[] datas = new int[3];
        for(int i = 0; i < 3; i++){
            datas[i] = Integer.parseInt(separada[i]);
        }
        extenso(datas[0],datas[1], datas[2]);
    }
}
