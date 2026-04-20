package ConsoleProject;

public enum Department {
    IT("Information Technology", "DEPT-001"),
    HR("Human Resources", "DEPT-002"),
    FINANCE("Finance & Accounts", "DEPT-003"),
    SALES("Sales & Marketing", "DEPT-004");

    private final String displayName;
    private final String internalCode;

    Department(String displayName, String internalCode) {
        this.displayName = displayName;
        this.internalCode = internalCode;
    }

    public String getDisplayName() { return displayName; }
    public String getInternalCode() { return internalCode; }
}
