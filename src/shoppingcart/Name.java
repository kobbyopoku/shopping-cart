package shoppingcart;

/**
 * This class represents the Name object
 * An Name consist of a firstname and lastname
 *
 * @author SETRIAKOR
 */
public class Name {
    private String firstName;
    private String familyName;

    public Name() {
    }

    public Name(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * @@param firstName the firstname to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the familyName
     */
    public String getFamilyName() {
        return familyName;
    }


    /**
     * @@param familyName the familyName to set
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return familyName + " " + firstName;
    }

    /**
     * @return the representation of a name object
     */
    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
