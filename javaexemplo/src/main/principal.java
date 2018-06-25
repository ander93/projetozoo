principal.java  
package heranca;    
public class principal {  
  
     
   public static void main(String[] args) {  
        
      Cliente c = new Cliente();  
        
      c.nome="Luiz";  
      c.cpf="073.777.796-21";  
      c.ImprimeNome();  
        
      Fornecedor f = new Fornecedor ();  
        
      f.nome="Deltatronic";  
      f.cnpj="073.856.9856.52-10";  
        
      f.ImprimeNome();  
        
  
   }  
  
}  