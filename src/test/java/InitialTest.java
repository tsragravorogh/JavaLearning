import field.Contract;
import org.junit.Test;
import repository.Repository;

public class InitialTest {

    @Test
    public void isAddingCorrect() {
        Repository repository = new Repository();
        Contract contract = new Contract();
        repository.add(contract);
        assert (repository.size() == 1);
    }

    @Test
    public void isGettingByIdCorrect() {
        Repository repository = new Repository();
        Contract contract = new Contract();
        repository.add(contract);
        assert (repository.getById(1) == contract);
    }

    @Test
    public void isDeletingCorrect() {
        Repository repository = new Repository();
        Contract contract = new Contract();
        repository.add(contract);
        repository.deleteById(1);
        assert (repository.getById(1) == null);
    }
}
