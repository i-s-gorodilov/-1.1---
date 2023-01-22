public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener error;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener error) {
        this.callback = callback;
        this.error = error;
    }

    public void start() {
        error.onError("Task " + " is done");
        for (int i = 0; i < 100; i++) {
            if (i != 33) {
                callback.onDone("Task " + i + " is done");
            } else {
                error.onError("Task " + i + " Error");
            }
        }
    }

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);

    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

}

