package domain;

/**
 * @author Thom van de Pas on 6-3-2018
 */
public class JenkinsSetup {

    private String name;

    public JenkinsSetup() {

    }

    public JenkinsSetup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
