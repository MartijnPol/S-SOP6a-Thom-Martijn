package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Thom van de Pas on 6-3-2018
 */
public class JenkinsTest {

    private JenkinsSetup jenkinsSetup;

    @Before
    public void Before() {
        jenkinsSetup = new JenkinsSetup("test");
    }

    @Test
    public void testGetAndSetName(){
        String expResult = "testSetName";
        jenkinsSetup.setName("testSetName");
        String result = jenkinsSetup.getName();

        assertEquals(expResult, result);
    }
}
