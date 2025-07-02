public static double desvioPadrao(float[] vet){
        float somatorio=0;
        float media = Utilidade.media(vet);
        for(float u: vet){
            somatorio += Math.pow((u-media),2);
        }
        double dp = Math.sqrt((somatorio/(vet.length-1)));
        return dp;
    }