public abstract  class Animal implements IEmitirSom, ISeMover, IDormir {
    // atributos
    protected int n_patas;
    protected String animal, nome;
    protected String cor, raca;

    // construtores
    public Animal() {
        setNome("Indefinida");
        setCor("Indefinida");
        setRaca("Indefinida");
        setNPatas(0);
    }

    public Animal(String animal, String nome, String cor, String raca, int nPatas) {
        setAnimal(animal);
        setNome(nome);
        setCor(cor);
        setRaca(raca);
        setNPatas(nPatas);
    }

    // métodos getters & setters
    public String getAnimal() {
        return this.animal;
    }

    public void setAnimal(String animal) {
        if (!animal.isEmpty()) {
            this.animal = animal;
        } else {
            System.out.println("O animal é inválido!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome é inválido!");
        }
    }

    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        if (!cor.isEmpty()) {
            this.cor = cor;
        } else {
            System.out.println("A cor é inválida!");
        }
    }

    public String getRaca() {
        return this.raca;
    }
    
    public void setRaca(String raca) {
        if (!raca.isEmpty()) {
            this.raca = raca;
        } else {
            System.out.println("A raça é inválida!");
        }
    }

    public int getNPatas() {
        return this.n_patas;
    }
    
    public void setNPatas(int nPatas) {
        if (nPatas >= 0) {
            this.n_patas = nPatas;
        } else {
            System.out.println("O número de patas é inválido!");
        }
    }

    // métodos das interfaces
    public abstract void emitirSom();
    public abstract void seMover(); 

    // métodos da classe
    public void seAlimentar(String tipoDeComida) {
        System.out.println(this.getNome() + " está comendo " + tipoDeComida + "!");
    }       

    public void exibir() {
        System.out.println("* Animal: " + this.getAnimal());
        System.out.println("* Nome do(a) " + this.getAnimal() + ": " + this.getNome());
        System.out.println("* Raça de " + this.getNome() + ": " + this.getRaca());
        System.out.println("* Cor de " + this.getNome() + ": " + this.getCor());
        System.out.println("* Números de patas: " + this.getNPatas());
    }
}
