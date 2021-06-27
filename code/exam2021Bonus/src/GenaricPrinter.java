import java.util.Arrays;

public class GenaricPrinter {
     public void print(viruse v){
         if(v instanceof fluFamily){
             System.out.println(Arrays.toString(coldDiseases.medicine));
         }
         if(v instanceof hepaticFamily){
             System.out.println(Arrays.toString(liverDiseases.medicine));
         }
         if(v instanceof ImmunityFamily){
             System.out.println(Arrays.toString(immunityDiseases.medicine));
         }
     }

}
