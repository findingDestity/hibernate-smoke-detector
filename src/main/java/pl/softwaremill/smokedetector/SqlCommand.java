package pl.softwaremill.smokedetector;

import com.google.common.collect.Lists;

import java.util.Date;
import java.util.List;

public class SqlCommand {

    private Date executionTime;
    private String command;
    private List<String> redundantTables = Lists.newArrayList();

    public SqlCommand() {
        command = "";
    }

    public Date getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
    }

    public String getCommandString() {
        return command;
    }

    public void appendFragment(String fragment) {
        this.command = command + fragment;
    }

    public List<String> getRedundantTables() {
        return redundantTables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SqlCommand)) return false;

        SqlCommand that = (SqlCommand) o;

        if (command != null ? !command.equals(that.command) : that.command != null) return false;
        if (executionTime != null ? !executionTime.equals(that.executionTime) : that.executionTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = executionTime != null ? executionTime.hashCode() : 0;
        result = 31 * result + (command != null ? command.hashCode() : 0);
        return result;
    }
}
