package Ru.psv.project;
import org.testng.annotations.Test;
import org.openqa.selenium.*;


public class GroupDelitionTest extends TestBase {

  @Test
  public void TestGroupDelition() {
    gotoGroupPage();
    selectedGroups();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
