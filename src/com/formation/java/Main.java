package com.formation.java;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        //Exercice 1
        /*
        System.out.println("--- Exercice 1 ---");
        int a = 3;
        int b = 5;
        System.out.println("a = "+a+" & b = "+b);
        int c = a;
        a=b;
        b=c;
        System.out.println("a = "+a+" & b = "+b);
        */

        //Exercice 2
        /*
        System.out.println("--- Exercice 2 ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le prix de votre objet");
        double prixHT = scanner.nextDouble();
        double prixTTC = prixHT*1.196;
        System.out.println("prix HT = "+prixHT+"\nPrix TTC = "+prixTTC);
        */

        //Exercice 2B
        /*
        System.out.println("--- Exercice 2B ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom");
        String nom = scanner.next();
        System.out.println("Bonjour "+nom);
         */

        //Exercice 3A
        /*
        System.out.println("--- Exercice 3A ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        double nb = scanner.nextDouble();
        if(nb>=0){
            System.out.println("positif");
        }
        else{
            System.out.println("négatif");
        }
         */

        //Exercice 3B
        /*
        System.out.println("--- Exercice 3B ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre A");
        double nbA = scanner.nextDouble();
        System.out.println("Entrez un nombre B");
        double nbB = scanner.nextDouble();
        if(nbA*nbB>=0){
            System.out.println("A*B positif");
        }
        else{
            System.out.println("A*B négatif");
        }
         */

        //Exercice 3C
        /*
        System.out.println("--- Exercice 3B ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prénom 1 :");
        String p1 = scanner.next();
        System.out.println("Prénom 2 :");
        String p2 = scanner.next();
        System.out.println("Prénom 3 :");
        String p3 = scanner.next();
        String[] prenoms = {p1,p2,p3};
        String[] prenoms2 = new String[3];
        System.arraycopy( prenoms, 0, prenoms2, 0, 3 );
        Arrays.sort(prenoms2);

        for(String prenom:prenoms){
            System.out.println(prenom);
        }
        */

        //Exercice 3D
        /*
        System.out.println("--- Exercice 3D ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre A");
        double nbA = scanner.nextDouble();
        System.out.println("Entrez un nombre B");
        double nbB = scanner.nextDouble();
        if(nbA*nbB>0){
            System.out.println("A*B positif");
        }
        else{
            if(nbA*nbB==0){
                System.out.println("A*B égal à 0");
            }
            else{
                System.out.println("A*B négatif");
            }
        }
        */

        //Exercice 3E
        /*
        System.out.println("--- Exercice 3E ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un âge");
        int age = scanner.nextInt();
        if(age >= 12){
            System.out.println("Cadet");
        }
        else{
            if(age>=10){
                System.out.println("Minime");
            }
            else{
                if(age>=8){
                    System.out.println("Pupille");
                }
                else{
                    if(age>=6){
                        System.out.println("Poussin");
                    }
                    else{
                        System.out.println("non répertorié");
                    }
                }
            }
        }
        */

        //Exercice 4A
        /*
        System.out.println("--- Exercice 4A ---");
        Scanner scanner = new Scanner(System.in);
        int nb = -1;
        do{
            System.out.println("Entrez un nombre entre 0 et 10");
            nb = scanner.nextInt();
        }while(nb<=0 || nb>=10);
         */

        //Exercice 4B
        /*
        System.out.println("--- Exercice 4B ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nb = scanner.nextInt();
        for (int i = nb ; i>=0 ; i--){
            System.out.println(i);
        }
         */

        //Exercice 4C
        /*
        System.out.println("--- Exercice 4C ---");
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int guess = 0;
        do{
            System.out.println("Min");
            min = scanner.nextInt();
            System.out.println("Max");
            max = scanner.nextInt();
        }while(min==max || min>max);

        boolean flag = false;
        Random rd = new Random();
        int random = rd.nextInt((max - min) + 1) + min;
        //pour tests
        //System.out.println(random);
        System.out.println("C'est parti ("+min+"-"+max+") :");
        do{
            System.out.println("");
            guess = scanner.nextInt();
            }
            if(guess>random){
                System.out.println("trop grand");
            }
            else{
                if(guess<random){
                    System.out.print("trop petit");
                }
                else{
                    System.out.print("gagné");
                    flag = true;
                }
            }
        }while(flag==false);

         */

        //Exercice 4D
        /*
        System.out.println("--- Exercice 4D ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nb :");
        int nb = scanner.nextInt();
        int res = 0;
        for(int i = nb ; i>=1; i--){
            res=res+i;
        }
        System.out.println(res);
         */

        //Exercice 5A
        /*
        System.out.println("--- Exercice 5A ---");
        int[] tab = {10,15,20,15,14,8};
        int total = 0;

        for(int nb:tab){
            total += nb;
        }
        System.out.println(total);

         */

        //Exercice 5B
        /*
        System.out.println("--- Exercice 5B ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre d'élèves :");
        int nbEleves = scanner.nextInt();
        int[] notes = new int[nbEleves];
        for(int i = 0;i<nbEleves;i++){
            System.out.println("note :");
            notes[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(notes));
         */

        //Exercice 5C
        /*
        System.out.println("--- Exercice 5C ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre d'élèves :");
        int nbEleves = scanner.nextInt();
        int[] notes = new int[nbEleves];
        for(int i = 0;i<nbEleves;i++){
            System.out.println("note :");
            notes[i] = scanner.nextInt();
        }
        //calcul moyenne
        double moyenne = 0;
        for(int note: notes){
            moyenne += note;
        }
        moyenne = moyenne/nbEleves;
        //calcul nb élèves au dessus de la moyenne
        int compteurMoyenne = 0;
        for (int note:notes){
            if (note > moyenne){
                compteurMoyenne++;
            }
        }
        System.out.println("nb d'élèves au dessus de la moyenne : "+compteurMoyenne);

         */

        //Exercice 5D
        /*
        System.out.println("--- Exercice 5D ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre d'élèves :");
        int nbEleves = scanner.nextInt();
        int[] notes = new int[nbEleves];
        for(int i = 0;i<nbEleves;i++){
            System.out.println("note :");
            notes[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(notes));
        //calcul moyenne
        double moyenne = 0;
        int inf8=0;
        int sup10=0;
        int sup15=0;

        for(int note: notes){
            moyenne += note;
            //acquisition des longueurs des tableaux
            if(note<8){inf8++;}
            if(note>10){sup10++;}
            if(note>15){sup15++;}
        }
        //création des tableaux
        int[] Inf8 = new int[inf8];
        int[] Sup10 = new int[sup10];
        int[] Sup15 = new int[sup15];

        moyenne = moyenne/nbEleves;
        System.out.println("moyenne = "+moyenne);

        //calcul nb élèves au dessus de la moyenne
        int compteurMoyenne = 0;
        for (int note:notes){
            if (note > moyenne){
                compteurMoyenne++;
            }
            if(note<8){
                inf8--;
                Inf8[inf8]=note;
            }
            if(note>10){
                sup10--;
                Sup10[sup10]=note;
            }
            if(note>15){
                sup15--;
                Sup15[sup15]=note;
            }
        }
        System.out.println("nb d'élèves au dessus de la moyenne : "+compteurMoyenne);
        System.out.println("nb de notes en dessous de 8 : "+Arrays.toString(Inf8));
        System.out.println("nb de notes au dessus de 10 : "+Arrays.toString(Sup10));
        System.out.println("nb de notes au dessus de 15 : "+Arrays.toString(Sup15));

         */

        //Exercice 5E
        /*
        System.out.println("--- Exercice 5E ---");
        int[] tab1 = {4,8,7,9,1,5,4,6};
        int[] tab2 = {7,6,5,2,1,3,7,4};

        int[] tab3 = new int[tab1.length];

        for(int i = 0; i<tab1.length; i++){
            tab3[i] = tab1[i] + tab2[i];
        }
        System.out.println(Arrays.toString(tab3));

         */

        //Exercice 5F
        /*
        System.out.println("--- Exercice 5F ---");
        int[] tab1 = {2,5,8,4};
        int[] tab2 = {6,7};
        int res=0;

        for(int nb1:tab1){
            for(int nb2:tab2){
                res += nb1*nb2;
            }
        }
        System.out.println(res);

         */

        //Exercice 5G
        /*
        System.out.println("--- Exercice 5G ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre de valeurs :");

        int[] vals = new int[scanner.nextInt()];

        for (int i=0;i<vals.length;i++){
            System.out.println("val "+(i+1)+" :");
            vals[i]=scanner.nextInt()+1;
        }
        System.out.println(Arrays.toString(vals));

         */

        //Exercice 5H
        /*
        System.out.println("--- Exercice 5H ---");
        Scanner scanner = new Scanner(System.in);
        int max=-1000000;
        int[] tab = new int[20];
        for(int i =0; i<tab.length; i++){
            System.out.println("val "+(i+1)+" :");
            tab[i] = scanner.nextInt();
        }

        for (int val : tab){
            if (val>max){
                max=val;
            }
        }

        System.out.println("val max : "+max);

         */

        //Exercice 5I
        /*
        System.out.println("--- Exercice 5I ---");
        Scanner scanner = new Scanner(System.in);
        int max=-1000000;
        int pos=-1;
        int[] tab = new int[5];
        for(int i =0; i<tab.length; i++){
            System.out.println("val "+(i+1)+" :");
            tab[i] = scanner.nextInt();
        }
        int compt = 0;
        for (int val : tab){
            compt++;
            if (val>max){
                max=val;
                pos=compt;
            }
        }

        System.out.println("val max : "+max+" à la position "+pos);

         */

        //Exercice 5J
        /*
        System.out.println("--- Exercice 5J ---");
        Scanner scanner = new Scanner(System.in);
        int max=-1000000;
        int pos=-1;
        int[] tab = new int[0];
        int index=-1;
        do{
            index++;
            System.out.println("val "+(index+1)+" :");

            //
            int [] temp = tab.clone();
            tab = new int[tab.length + 1];
            System.arraycopy(temp, 0, tab, 0, temp.length);
            //
            tab[index] = scanner.nextInt();
        }while(tab[index]!=0);
        int compt = 0;
        for (int val : tab){
            compt++;
            if (val>max){
                max=val;
                pos=compt;
            }
        }

        System.out.println("val max : "+max+" à la position "+pos);

         */

        //Exercice 6A
        /*
        System.out.println("--- Exercice 6A ---");
        int[][] tab = {{0, 18}, {1, 45}, {45, 48}, {-3, 2}};
        int max=-10000;
        for(int[] tab2:tab){
            for(int val : tab2){
                if (val>max){
                    max=val;
                }
            }
        }
        System.out.println("valeur max : "+max);

         */

        //Exercice 6B
        /*
        System.out.println("--- Exercice 6B ---");
        Scanner scanner = new Scanner(System.in);
        String[][] tab = new String[0][2];
        String note="";
        String prenom="";
        int compt=-1;
        do{
            compt++;

            System.out.println("note :");
            note = scanner.next();
            if (Integer.parseInt(note)==-1){break;}
            System.out.println("prenom :");
            prenom = scanner.next();

            //
            String[][]temp = tab.clone();
            tab = new String[tab.length + 1][2];
            System.arraycopy(temp, 0, tab, 0, temp.length);
            //

            tab[compt][0] = note;
            tab[compt][1] = prenom;

        }while(true);

        for(String[] elem:tab){
            System.out.println(elem[1]+" : "+elem[0]);
        }

         */

        //Exercice 7A
        /*
        System.out.println("--- Exercice 7A ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("mot :");
        String mot = scanner.next();
        System.out.println(mot.length()+" lettres");

         */

        //Exercice 7B
        /*
        System.out.println("--- Exercice 7B ---");
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        boolean flag = false;
        Random rd = new Random();
        int random = rd.nextInt((5 - 0) + 1) + 0;
        //pour tests
        //System.out.println(random);
        System.out.println("C'est parti :");
        do {
            System.out.println("");
            guess = scanner.nextInt();
            if (guess > random) {
                System.out.println("trop grand");
            } else {
                if (guess < random) {
                    System.out.print("trop petit");
                } else {
                    System.out.print("gagné");
                    flag = true;
                }
            }
        }while (flag == false) ;

         */

        //Exercice 7C
        /*
        System.out.println("--- Exercice 7C ---");
        int[] tab = {1,2,3};
        affTab(tab);

         */

        //Exercice 8A
        /*
        System.out.println("--- Exercice 8A ---");
        System.out.println(calcTTC(15.4, 1.196));

         */

        //Exercice 8B
        /*
        System.out.println("--- Exercice 8B ---");
        int[] tab = {13,2,3,16,7,9,11};
        System.out.println(Arrays.toString(tsbSup(tab,10)));

         */

        //############## Exercices Bonus ##############//

        //Tirage par ordre numérique
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("donnez 5 réels :");
        double[] tab = new double[5];
        for (int i = 0; i<5; i++){
            tab[i]=scanner.nextDouble();
        }
        Arrays.sort(tab);
        double[] tab2 = new double[5];
        for(int i = 0; i<5; i++){
            tab2[i]=tab[tab.length-(i+1)];
        }
        System.out.println("ordre croissant : "+Arrays.toString(tab));
        System.out.println("ordre décroissant : "+Arrays.toString(tab2));

         */

        //Triangle de Pascal
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("valeur :");
        int nb = scanner.nextInt();
        ArrayList<int[]> triangle = new ArrayList<>();
        int length = 0;
        for(int i = 0; i<nb; i++){
            triangle.add(new int[i + 1]);
            triangle.get(i)[0]=1;
            length = triangle.get(i).length;
            triangle.get(i)[length-(1)]=1;
        }
        for (int[] tab:triangle){
            if(tab.length>2){
                for(int i=1;i<tab.length-1;i++){
                    tab[i]=triangle.get(tab.length-2)[i]+triangle.get(tab.length-2)[i-1];
                }
            }
            System.out.println(Arrays.toString(tab));
        }

         */

        //mail
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("adresse e-mail : ");
        String email = scanner.next();
        boolean correct=true;
        String message = "";

        //Le premier caractère n'est pas un chiffre
        char l1 = email.charAt(0);
        if("123456789".contains(""+l1)){
            correct = false;
            message+="Le premier caractère ne doit pas être un chiffre\n";
        }

        //Un seul caractère '@'
        int nbArobase = email.length() - email.replace("@", "").length();
        if (nbArobase!=1){
            correct=false;
            message+="Il ne doit y avoir q'un arobase '@'\n";
        }

        //Pas d'espace
        int nbEspace = email.length() - email.replace(" ", "").length();
        if (nbEspace!=0){
            correct=false;
            message+="Il ne doit pas y avoir d'espace\n";
        }

        //Au minimum 3 caractères avant l'arobase
        if(email.substring(0,3).contains("@")){
            correct=false;
            message+="Il doit y avoir au minimum 3 caractères avant l'arobase @\n";
        }

        //Un seul caractère '.'
        int nbPoint = email.length() - email.replace(".", "").length();
        if (nbPoint!=1){
            correct=false;
            message+="Il ne doit y avoir 1 point\n";
        }else{

            //Le point est après l'arobase
            if (nbArobase==1){
                if (email.substring(email.indexOf('@'), email.length()).contains(".")==false){
                    correct=false;
                    message+="Le point doit se trouver après l'arobase\n";
                }
            }else{
                //Au moins 3 caractères avant le point
                if((email.substring(email.indexOf('.')-3,email.indexOf('.'))).contains("@")){
                    correct=false;
                    message+="Il doit y avoir au moins 3 caractères avant le point\n";
                }

                //Au moins 2 caractères avant le point
                if(email.length()-email.indexOf(".") <3){
                    correct = false;
                    message+="Il doit y avoir au moins 2 caractères après le point\n";
                }
            }
        }
        System.out.println(message+correct);

         */

        //jeu de la vie
        /*
        Scanner scan = new Scanner(System.in);
        char[][] grille = new char[10][10];
        String[][] statut = new String[10][10];

        //initialisation de la grille avec des cellules "mortes"
        for(int i = 0; i<grille.length; i++){
            for(int j = 0; j<grille.length; j++){
                grille[i][j] = '.';
            }
        }

        grille[0][4] = '0';
        grille[1][4] = '0';
        grille[2][4] = '0';
        grille[3][4] = '0';
        grille[4][4] = '0';
        grille[5][4] = '0';
        grille[6][4] = '0';
        grille[7][4] = '0';

        do{
            affgrille(grille);
            for(int i = 0; i<grille.length; i++){
                for(int j = 0; j<grille.length; j++){
                    statut[i][j] = verif(grille, i, j);
                }
            }
            for(int i = 0; i<grille.length; i++){
                for(int j = 0; j<grille.length; j++){
                    if (statut[i][j]=="vivant"){
                        grille[i][j]='0';
                    }
                    else{
                        if (statut[i][j]=="mort"){
                            grille[i][j]='.';
                        }
                        else{
                            System.out.println("ERREUR STATUT !");
                        }
                    }
                }
            }

        }while (scan.nextInt()!=0);

         */

        //Sapin de noël
        /*
        for(int i = 1; i<=5;i++){
            System.out.println(" ".repeat(5-i) +"* ".repeat(i));
        }
        for(int i = 0; i<5;i++){
            if (i<4){
                System.out.print(" ".repeat(4-i) +" *"+"  ".repeat(i));
                if(i>0){
                    System.out.println("*");
                }
                else{
                    System.out.println("");
                }
            }else{
                System.out.println(" ".repeat(4-i) +" * ".repeat(i));
            }

        }
        for(int i = 1; i<=5;i++){
            System.out.print("* ".repeat(i));
            if(i<5){
                System.out.println("");
            }
        }
        for(int i = 5; i>=1;i--){
            System.out.println("* ".repeat(i));
        }

         */

        //Snake
        /*
        char[][] grille = new char[10][10];
        //Initialisation
        for (int i=0; i<grille.length;i++){
            for (int j=0; j<grille[i].length;j++){
                grille[i][j]=('.');
            }
        }
        int[] pos = {0,0};
        int[] oldPos = {0,0};
        boolean verif = true;
        char touche = ' ';
        ArrayList<int[]> queue = new ArrayList<>();
        grille[0][0]='v';
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        boolean bouffe = false;
        boolean start = true;
        int[] bouffePos = new int[2];

        do{
            System.out.println("SCORE : "+queue.size());

            affgrille(grille);
            //réinitialisation de la grille
            for (int i=0; i<grille.length;i++){
                for (int j=0; j<grille[i].length;j++){
                    grille[i][j]=('.');
                }
            }
            //déplacement (coordonnées)
            do{
                verif=true;
                touche = scan.next().charAt(0);
                if (pos[0]==0 && touche=='z'){
                    verif=false;
                    System.out.println("erreur");
                }
                if (pos[1]==0 && touche=='q'){
                    verif=false;
                    System.out.println("erreur");
                }
                if (pos[0]==grille.length-1 && touche=='s'){
                    verif=false;
                    System.out.println("erreur");
                }
                if (pos[1]==grille[0].length-1 && touche=='d'){
                    verif=false;
                    System.out.println("erreur");
                }
            }while(verif==false);

            //déplacement de la queue
            for(int i = (queue.size()-1); i>=0;i--){
                if (i==0) {
                    queue.get(i)[0] = oldPos[0];
                    queue.get(i)[1] = oldPos[1];
                }
                else{
                    queue.get(i)[0]=queue.get(i-1)[0];
                    queue.get(i)[1]=queue.get(i-1)[1];
                }
                grille[queue.get(i)[0]][queue.get(i)[1]]='O';
            }
            oldPos=pos;

            //positionnement de la tête
            switch (touche){
                case 'z':
                    pos[0]-=1;
                    grille[pos[0]][pos[1]]='ᐱ';
                    break;

                case 'q':
                    pos[1]-=1;
                    grille[pos[0]][pos[1]]='<';
                    break;

                case 's':
                    pos[0]+=1;
                    grille[pos[0]][pos[1]]='v';
                    break;

                case 'd':
                    pos[1]+=1;
                    grille[pos[0]][pos[1]]='>';
                    break;
            }
            for (int[] q:queue){
                if(q[0]==pos[0] && q[1]==pos[1]){
                    start=false;
                }
            }

            if (pos[0]==bouffePos[0] && pos[1]==bouffePos[1]){
                bouffe=false;
                queue.add(new int[2]);
            }
            if (bouffe == false){
                bouffePos[0] = rd.nextInt(0, grille.length);
                bouffePos[1] = rd.nextInt(0, grille[0].length);
                bouffe = true;
            }

            //Placement de la bouffe
            grille[bouffePos[0]][bouffePos[1]]='X';

        }while (start);

        System.out.println("OUCH !!!\nSCORE FINAL : "+queue.size());

         */

        //Matrix
        /*
        char[][] grille = new char[20][25];
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        //affgrille(grille);
        //initialisation de la grille
        for(int i = 0 ; i< grille.length ; i++){
            for(int j = 0 ; j < grille[0].length ; j++){
                grille[i][j]= ' ';
            }
        }
        int rdNbChar;//nb de caractère aléatoire
        int rdCol;//num de colonne aléatoire
        int colSize;//taille de la liste contenant les numéros de colonne disponibles

        Scanner scan = new Scanner(System.in);
        for(int z = 0 ; z < 100 ; z++){
            System.out.println(System.lineSeparator().repeat(20));

            //nb de caracères qui vont être créés
            rdNbChar = r.nextInt(1,grille.length+1);

            //acquisition des numéros de colonne
            ArrayList<Integer> numCol = new ArrayList<>();
            for(int i = 0; i< grille.length; i++){
                numCol.add(i);
            }
            //System.out.println(Arrays.toString(numCol.toArray()));


            //liste des caractères à afficher
            ArrayList<Character> carac = new ArrayList<>();
            //acquisition des caractères à afficher
            for(int i = 0; i < rdNbChar; i++){
                c = (char)(r.nextInt(26) + 'a');
                carac.add(c);
            }
            //System.out.println("rdNbChar = "+rdNbChar);
            //System.out.println(Arrays.toString(carac.toArray()));
            //choix d'une colonne aléatoire et y afficher le caractère
            //System.out.println("col.size() = "+numCol.size());
            colSize = numCol.size();
            for (int i = 0; i< carac.size();i++){
                rdCol = r.nextInt(0, numCol.size());
                //System.out.println("col :"+numCol.get(rdCol)+" -> "+carac.get(i));
                grille[0][rdCol] = carac.get(i);
                numCol.remove(rdCol);
                //System.out.println(Arrays.toString(numCol.toArray()));
            }
            //System.out.println("fin");
            affgrille(grille);
            for(int i = grille.length-1; i>0; i--){
                for(int j = 0; j<grille[0].length; j++) {
                    grille[i][j] = grille[i - 1][j];
                }
            }
            for(int i = 0; i<grille[0].length; i++){
                grille[0][i]=' ';
            }
            Thread.sleep(200);
        }

         */


        //Sokoban
        /*
        //Création de la grille
        String[][] grille = new String[6][6];

        //Initialisation
        for (int i=0; i<grille.length;i++){
            for (int j=0; j<grille[i].length;j++){
                grille[i][j]=("\t[ ]");
            }
        }

        //Déclaration des variables
        int[] pos = {1,1};
        int[] posBox = {2,2};
        Scanner scan = new Scanner(System.in);
        boolean verif = true;
        boolean start = true;
        char touche = ' ';

        //Boucle principale
        do{
            //Placement du personnage et de la box
            grille[pos[0]][pos[1]]="\t[☺]\t";
            grille[posBox[0]][posBox[1]]="\t ☒\t";

            //Affichage de la grille
            affgrille(grille);

            //réinitialisation de la grille
            for (int i=0; i<grille.length;i++){
                for (int j=0; j<grille[i].length;j++){
                    grille[i][j]=("\t[ ]");
                }
            }

            //Acquisition de la touche (premier 'char' de la ligne)
            touche = scan.next().charAt(0);

            //Déplacement du personnage et de la box en cas de collision
            if(touche == 'z' && pos[0]!=0){
                if(pos[0]-1==posBox[0] && pos[1]==posBox[1]){
                    if(posBox[0]!=0){
                        pos[0]-=1;
                        posBox[0]-=1;
                    }
                    else{
                        System.out.println("bloqué");
                    }
                }else{
                    pos[0]-=1;
                }
            }
            if(touche == 's' && pos[0]!=grille.length-1){
                if(pos[0]+1==posBox[0] && pos[1]==posBox[1]){
                    if(posBox[0]!=grille.length-1){
                        pos[0]+=1;
                        posBox[0]+=1;
                    }
                    else{
                        System.out.println("bloqué");
                    }
                }else{
                    pos[0]+=1;
                }
            }
            if(touche == 'q' && pos[1]!=0){
                if(pos[0]==posBox[0] && pos[1]-1==posBox[1]){
                    if(posBox[1]!=0){
                        pos[1]-=1;
                        posBox[1]-=1;
                    }
                    else{
                        System.out.println("bloqué");
                    }
                }else{
                    pos[1]-=1;
                }
            }
            if(touche == 'd' && pos[1]!=grille[0].length-1 ){
                if(pos[0]==posBox[0] && pos[1]+1==posBox[1]){
                    if(posBox[1]!=grille[0].length-1){
                        pos[1]+=1;
                        posBox[1]+=1;
                    }
                    else{
                        System.out.println("bloqué");
                    }
                }else{
                    pos[1]+=1;
                }
            }
            //Choix d'arrêter le programme
            if(touche == '0'){
                start = false;
            }
        }while(start);

         */


        //############## Examen ##############//

        //Exercice 1 : Un kilomètre à pied
        /*
        for(int i = 1 ; i <=15 ; i++){
            if(i==1){
                System.out.println(i+" kilomère à pied, ça use, ça use, "+i+" kilomètre à pied ça use les souliers");
            }else{
                System.out.println(i+" kilomères à pied, ça use, ça use, "+i+" kilomètres à pied ça use les souliers");
            }
        }

         */

        //Exercice 2 : Moyenne
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("entier : ");
        int entier = scan.nextInt();
        System.out.print("réel : ");
        double reel = scan.nextDouble();
        System.out.println(entier+" + "+reel+" = "+(entier+reel));
        System.out.println("moyenne = "+(entier+reel)/2);

         */

        //Exercice 4 : Deviner un nombre
        /*
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int randInt;
        int nbCoups;
        int coupsMin = 100000;
        int guess;
        boolean continuer = true;
        boolean trouve;
        int ouinon;
        boolean flagouinon;
        do{
            flagouinon = false;
            trouve = false;
            nbCoups = 0;
            randInt = rd.nextInt(1,100+1);
            do{
                System.out.print("nb: ");
                guess = scan.nextInt();
                if (randInt > guess){
                    System.out.println("trop petit");
                }else{
                    if (randInt < guess){
                        System.out.println("trop grand");
                    }
                    else{
                        System.out.println("gagné");
                        trouve = true;
                    }
                }
                nbCoups++;
            }while(!trouve);
            if(nbCoups<coupsMin){
                coupsMin=nbCoups;
            }
            do{
                System.out.println("continuer ? Oui[1]/Non[0]");
                ouinon = scan.nextInt();
                if(ouinon == 1){
                    flagouinon = true;
                }else{
                    if(ouinon == 0){
                        continuer = false;
                        flagouinon = true;
                    }
                }
            }while(!flagouinon);
        }while(continuer);
        System.out.println("Meilleur score = "+coupsMin);

         */

        //Bonus 1 : Une forêt de sapins
        /*
        Random rd = new Random();
        for (int i = 0 ; i< 12 ; i ++){
            affSapin(rd.nextInt(3,9));
        }

         */

        //Bonus 2 : Sierpinski
        /*
        int lig= 32;
        int div;
        int ii;
        int jj;
        int max = 1;

        while(max < lig){
            max*=2;
        }
        for(int i = (lig-1) ; i >= 0 ; i--){
            for(int j = 0 ; j <= (max-i-1); j++){
                ii = i;
                jj = j;
                div = max;
                while(div>1 && (ii+jj)<div){
                    div /= 2;
                    ii = ii%div;
                    jj = jj%div;
                }
                if(div==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

         */


    }

    static void affSapin (int h){
        for(int i = 1; i<=h;i++){
            System.out.println(" ".repeat(h-i) +"* ".repeat(i));
        }
        System.out.println("\n".repeat(2));
    }

    static void affgrille (char[][] grille) throws IOException {
        for(char[] ligne:grille){
            for(char elem:ligne){
                System.out.print(" "+elem+" ");
            }
            System.out.print("\n");
        }
    }

    static void affgrille (String[][] grille) throws IOException {
        for(String[] ligne:grille){
            for(String elem:ligne){
                System.out.print(""+elem+" ");
            }
            System.out.print("\n\n\n");
        }
    }

    static String verif(char[][] grille,int i,int j){
        int voisins=0;

        try{
            if(i!=0){
                //haut gauche
                if (j!=0){
                    if (grille[i-1][j-1]=='0'){
                        voisins++;
                    }
                }

                //haut milieu
                if (grille[i-1][j]=='0'){
                    voisins++;
                }
                if(j!= grille.length-1){
                    //haut droite
                    if (grille[i-1][j+1]=='0'){
                        voisins++;
                    }
                }
            }

            //gauche
            if(j!=0){

                if (grille[i][j-1]=='0'){
                    voisins++;
                }
            }

            //droite
            if(j!=grille.length-1){
                if (grille[i][j+1]=='0'){
                    voisins++;
                }
            }

            if(i!=grille.length-1){
                if(j!=0){
                    //bas gauche
                    if (grille[i+1][j-1]=='0'){
                        voisins++;
                    }
                }
                //bas milieu
                if (grille[i+1][j]=='0'){
                    voisins++;
                }
                if(j!=grille.length-1){
                    //bas droite
                    if (grille[i+1][j+1]=='0'){
                        voisins++;
                    }
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }


        if (voisins==3){
            return "vivant";
        }else{
            if (grille[i][j]=='0' && voisins == 2){
                return "vivant";
            }
            else{return "mort";}
        }
    }

    //7C
    static void affTab(int[] tab) {
        String str = "#####\nValeur du tableau : [";
        for(int val:tab){
            str+=val+" - ";
        }
        str=str.substring(0, str.length() - 3);
        str+="]\n####";
        System.out.println(str);
    }

    //8A
    static double calcTTC(double HT, double TVA){
        return HT*TVA;
    }

    //8B
    static int[] tsbSup(int[] tab, int val){
        int[] ret = new int[0];
        int compteur = -1;
        for(int i:tab){
            if (i>val){
                compteur++;
                //
                int[] temp = ret.clone();
                ret = new int[ret.length + 1];
                System.arraycopy(temp, 0, ret, 0, temp.length);
                //
                ret[compteur] = i;
            }
        }
        return ret;
    }


}