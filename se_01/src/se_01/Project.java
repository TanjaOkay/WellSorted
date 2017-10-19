package se_01;

public class Project {
    String [][] sim ;
    int anzahl=0;
    
    public  Project(String [][] prio){
        sim = prio;
    }
    public boolean isWellSorted( String [] test){
        for(int m=0; m<test.length; m++){
            for(int n=m+1; n<test.length; n++){
                if( test[n].equals(test[m])){
                    return false;
                }
            }
            
            // das ist eine ännderung
            // änderung von 19.10 rezan 1
            // hallo ich bin auch hier
        }
        for( int i=0; i<sim.length;i++){
            for( int j=0; j<test.length; j++){
                if( sim[i][0].equals(test[j])){
                    for(int k=j+1; k<test.length; k++){
                        if((sim[i][1].equals(test[k])&&(!(sim[i][0].equals(sim[i][1]))))){
                            anzahl+=1;
                            
                        }
                    }
                }
            }
        }
        return (sim.length==anzahl);
    }
  System.println(" änderung");
}
