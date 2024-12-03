import java.time.LocalDate;

public class SystemAlert {
    private AlertSeverity severity;
    private String message;
    private int executionCode;
    private LocalDate timestamp;
    private String process;

    public SystemAlert(AlertSeverity severity, String message, int executionCode, LocalDate timestamp, String process) {
        this.severity = severity;
        this.message = message;
        this.executionCode = executionCode;
        this.timestamp = timestamp;
        this.process = process;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getExecutionCode() {
        return executionCode;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String getProcess() {
        return process;
    }

    @Override
    public String toString() {
        return "SystemAlert{" +
                "severity=" + severity +
                ", message='" + message + '\'' +
                ", executionCode=" + executionCode +
                ", timestamp=" + timestamp +
                ", process='" + process + '\'' +
                '}';
    }
}
