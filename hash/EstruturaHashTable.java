package hash;
public class EstruturaHashTable implements EstruturaDeDados {

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
        int posicao = chave % 1000;
        if (tabela[posicao] != null) {
            return false;
        }
        tabela[posicao] = chave;
        return true;
    }

    @Override
    public boolean delete(int chave) {
        int posicao = chave % 1000;
        if (tabela[posicao] != null && tabela[posicao] == chave) {
            tabela[posicao] = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean search(int chave) {
        int posicao = chave % 1000;
        if (tabela[posicao] != null && tabela[posicao] == chave) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        EstruturaHashTable hashTable = new EstruturaHashTable();

        // Inserindo elementos na tabela hash
        System.out.println(hashTable.insert(123));
        System.out.println(hashTable.insert(567));
        System.out.println(hashTable.insert(1001));
        System.out.println(hashTable.insert(789));
        System.out.println(hashTable.insert(123));

        // Buscando elementos na tabela hash
        System.out.println(hashTable.search(567));
        System.out.println(hashTable.search(789));
        System.out.println(hashTable.search(555));

        // Removendo elementos da tabela hash
        System.out.println(hashTable.delete(567));
        System.out.println(hashTable.delete(789));
        System.out.println(hashTable.delete(555));
    }
}
