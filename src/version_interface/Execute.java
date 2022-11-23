package version_interface;

/**
 * 버전인터페이스 사용 예시
 */
public class Execute {
    public static void main(String[] args) {
/*
        ExampleClas exampleClas = new ExampleClas();
        if (exampleClas instanceof ReversibleCommand) {
            ReversibleCommand exampleClassDowncast = (ReversibleCommand) exampleClas;
            exampleClassDowncast.undo();
        }
*/
        Command command = new Command() {
            @Override
            public void run() {
            }
        };

        if (command instanceof ReversibleCommand) {
            ReversibleCommand reversibleCommandDowncast = (ReversibleCommand) command;
            reversibleCommandDowncast.undo();
        }
    }
}
