package ro.ubb.exam.Domain;

public class IdGenerator {
    private long id = 0;

    public long generate() {
        id++;
        return id;
    }

    // IdGenerator.generate(); -> metoda este statica

    // IdGenerator idGenerator = new IdGenerator();
    // idGenerator.generate(); -> metoda nu este statica
}
