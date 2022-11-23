package version_interface;

/**
 * version interface
 */
public interface ReversibleCommand extends  Command{
    void undo();
}
