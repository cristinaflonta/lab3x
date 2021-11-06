package ro.ubb.exam.Domain;

public class Entity<ID> {              //template

    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public String toString() {             //Clasa Object sageata linia 16 in sus
        return "Entity{" +
                "id=" + id +
                '}';
    }

}
