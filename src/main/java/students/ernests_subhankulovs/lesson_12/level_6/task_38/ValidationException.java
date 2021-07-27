package students.ernests_subhankulovs.lesson_12.level_6.task_38;

class ValidationException extends Exception  {
    private String ruleName;
    private String description;
    private String fieldName;

    ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
