public class Utilidade {
    public static float media(float[] vet){
        float soma = 0;
        for(float u: vet){
            soma += u;
        }
        return (float) soma/vet.length;

    }
    public static float soma(float[] vet){
        float somador =0;
        for(float v:vet){
            somador+= v;
        }
        return somador;
    }
    public static float maior(float[] vet){
        float maior = vet[0];
        for(float v: vet){
            if(maior < v){
                maior = v;
            }
        }
        return maior;
    }

    public static float menor(float[] vet){
        float menor = vet[0];
        for(float v: vet){
            if(menor > v){
                menor = v;
            }
        }
        return menor;
    }
    public static int max(int a, int b){
        return (a>b ? a:b);
    }
    public static double desvioPadrao(float[] vet){
        float somatorio=0;
        float media = Utilidade.media(vet);
        for(float u: vet){
            somatorio += Math.pow((u-media),2);
        }
        double dp = Math.sqrt((somatorio/(vet.length-1)));
        dp = dp*10000;
        dp = Math.round(dp);
        dp = dp/10000;
        return dp;
    }
}
