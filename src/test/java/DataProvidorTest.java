import org.testng.annotations.DataProvider;

public class DataProvidorTest {

    @DataProvider(name = "credentials")
    public Object[][] getDataValid() {
        return new Object[][] {
                {"standard_user", "secret_sauce"}
        };
    }

    @DataProvider(name = "credentialsInValid")
    public Object[][] getDataINValid() {
        return new Object[][]{
                {"", ""},
                {"standard_use", "secret_saue"}

        };
    }

        @DataProvider(name = "credentialsChekOut")
        public Object[][] getDataOfCheckOut() {
            return new Object[][] {
                    {"standard_user","secret_sauce", "dina", "ahmed","11111"}
            };
    }


}
