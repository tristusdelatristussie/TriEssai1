/**
 * Created by touit on 14/02/2017.
 */
public class Tri {




    private char tableauChar[];

    private int i;

    private int j;

    char tabComp[];




    public String compareTab(char tableauChar[]){

        setTableauChar(tableauChar);

        int r= 0;

        for( i=0; i < tableauChar.length; i++){

            tabComp[i] = tableauChar[i];

        }

        for( j=0; j < tableauChar.length; j++){





            if(tabComp[i] == tableauChar[j]) {

                r++;

                if(r>=2){


                 /*   System.out.println("Le caractere " + tabComp[i]+ "apparait deux fois"); */
                    return ("Le caractere " + tabComp[i]+ "apparait deux fois");


                }
            }

        }

    return ("Pas de nombres en double");

    }

    public void setTableauChar(char[] tableauChar) {
        this.tabComp = new char[tableauChar.length];
        this.tableauChar = new char[tableauChar.length];

    }




}
