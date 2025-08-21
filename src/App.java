public class App {
    public static void main(String[] args) throws Exception {
       Livro livro = new Livro();
       Livro livrodois = new Livro();
       Cliente cliente = new Cliente();

       livro.nome = "Jogos Vorazes";
       livro.numerodepaginas = 200;
       livro.sinopse = "Na região antigamente conhecida como América do Norte, a Capital de Panem controla 12 distritos e os força a escolher um garoto e uma garota, conhecidos como tributos, para competir em um evento anual televisionado. Todos os cidadãos assistem aos temidos jogos, no qual os jovens lutam até a morte, de modo que apenas um saia vitorioso. A jovem Katniss Everdeen, do Distrito 12, confia na habilidade de caça e na destreza com o arco, além dos instintos aguçados, nesta competição mortal.";
       livro.mostrarAtributos();
       livro.mostrarSinopse ();
       


       livrodois.nome = "Eu sou a Lenda";
       livrodois.numerodepaginas = 250;
       livrodois.sinopse = "Robert Neville é um brilhante cientista e o único sobrevivente de uma epidemia que transformou os humanos em mutantes sedentos por sangue. Andando pela cidade de Nova York, ele procura por outros possíveis sobreviventes e tenta achar a cura da praga usando seu próprio sangue, que é imune.";
       livrodois.mostrarAtributos();
       livrodois.mostrarSinopse();

       cliente.nome = "Richard Felipe";
       cliente.codigo = 777;
       cliente.cpf = "020.167.858-42";
       cliente.endereco = "Avenida Jubileu Bairro Sacramenta Passagem 69";
       cliente.mostrarDadosCliente();
       cliente.exibirEndereco();
       
    }
}
