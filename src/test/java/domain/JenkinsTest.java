package domain;

import domain.JenkinsSetup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
    public void getAndSetNameTest(){
        String expResult = "testSetName";
        jenkinsSetup.setName("testSetName");
        String result = jenkinsSetup.getName();

        assertEquals(expResult, result);
        jenkinsSetup = new JenkinsSetup();
        assertNotEquals("test", null);
    }
}
