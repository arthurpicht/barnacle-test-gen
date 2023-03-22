package de.arthurpicht.barnacleGeneratorTest.utils;

import java.util.Objects;

public class TestCaseIds {

    private final String testGroupId;
    private final String testCaseId;

    public TestCaseIds(String testGroupId, String testCaseId) {
        this.testGroupId = testGroupId;
        this.testCaseId = testCaseId;
    }

    public String getTestGroupId() {
        return testGroupId;
    }

    public String getTestCaseId() {
        return testCaseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestCaseIds that = (TestCaseIds) o;
        return testGroupId.equals(that.testGroupId) && testCaseId.equals(that.testCaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testGroupId, testCaseId);
    }

}
