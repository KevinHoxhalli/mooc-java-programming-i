
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmpty() {
       assertEquals(0,management.exerciseList().size()); 
    }
    
    @Test
    public void addExercise() {
        management.add("New ex");
        assertEquals(1,management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseinList() {
        management.add("New ex");
        assertTrue(management.exerciseList().contains("New ex"));
    }
    
    @Test
    public void exerciseComplete() {
        management.add("New ex");
        management.markAsCompleted("New ex");
        assertTrue(management.isCompleted("New ex"));
    }
    
    @Test
    public void ifNotMarkedCompletedExercise() {
        management.add("New ex");
        management.markAsCompleted("New ex");
        assertFalse(management.isCompleted("New s"));
    }
    
}
