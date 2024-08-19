class Task {
    protected final String name;
    protected boolean isDone;

    Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    void markAsDone() {
        this.isDone = true;
    }

    void unmark() {
        this.isDone = false;
    }
    @Override
    public String toString() {
        return "[" + (this.isDone ? "X" : " ") + "] " + this.name;
    }
}
