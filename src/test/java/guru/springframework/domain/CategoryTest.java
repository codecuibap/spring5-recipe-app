package guru.springframework.domain;

import junit.framework.TestCase;
import org.junit.Test;

public class CategoryTest extends TestCase {

    Category category;

    @Override
    public void setUp() {
        category = new Category();
    }

    @Test
    public void testGetId() {
        Long idValue = 41L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void testGetDescription() {
    }

    @Test
    public void testGetRecipes() {
    }
}