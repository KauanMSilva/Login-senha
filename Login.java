public class Login {

  public static void main(String args[]) {

      String usuario = args[0];
      String senha = args[1];

      if (usuario.equals("admin")) {
         if (senha.equals("1234")) {
           System.out.println("###### LOGADO COM SUCESSO ###");
         } else {
           System.out.println("###### SENHA INVÁLIDA ###");
         }
      } else {
	System.out.println("###### USUÁRIO NÃO ENCONTRADO ###");
      }


   }

}