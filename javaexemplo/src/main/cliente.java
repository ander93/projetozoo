cliente.java  
  
package heranca;  
  
public class Cliente extends Pessoa {  
     
   String cpf;  
     
   public void ImprimeNome (){  
        
      System.out.println("Nome do cliente � : " + nome + "\n N� CPF: " + cpf + "\n Seu endereco :" + endereco);  
        
  
   }  
  
}  