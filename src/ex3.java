public class ex3 {

    public static void validarSenha(String senha) throws SenhaFracaException {
        if (senha.length() < 8) {
            throw new SenhaFracaException("A senha deve ter no mínimo 8 caracteres.");
        }

        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                temNumero = true;
                break;
            }
        }

        if (!temNumero) {
            throw new SenhaFracaException("A senha deve ter pelo menos 1 número.");
        }

        System.out.println("Senha válida.");
    }

    public static void main(String[] args) {
        try {
            validarSenha("abc12345");
        } catch (SenhaFracaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}