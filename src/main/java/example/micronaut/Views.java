package example.micronaut;

public class Views {
    public static interface PatchView {

    }

    public static interface CreateView extends PatchView {

    }

    public static interface ResponseView {}

    public static interface InternalView extends ResponseView {}
}

