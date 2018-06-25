cliente.java  
  
package heranca;  
  
public class Cliente extends Pessoa {  
     
   String cpf;  
     
   public void ImprimeNome (){  
        
      System.out.println("Nome do cliente é : " + nome + "\n Nº CPF: " + cpf + "\n Seu endereco :" + endereco);  
        
  
   }  
  
}  