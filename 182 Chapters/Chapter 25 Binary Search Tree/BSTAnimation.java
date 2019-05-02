import javafx.application.Application; 
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField; 
import javafx.scene.layout.BorderPane; 
import javafx.scene.layout.HBox;


public class BSTAnimation extends Application {
   @Override // Override the start method in the Application class
 public void start(Stage primaryStage) {
 BST<Integer> tree = new BST<>(); // Create a tree
 BorderPane pane = new BorderPane();
 BTView view = new BTView(tree); // Create a BTView
    pane.setCenter(view);

 TextField tfKey = new TextField();
 tfKey.setPrefColumnCount(3);
      tfKey.setAlignment(Pos.BASELINE_RIGHT);
 Button btInsert = new Button("Insert");
 Button btDelete = new Button("Delete");
 HBox hBox = new HBox(5);
 hBox.getChildren().addAll(new Label("Enter a key: "),tfKey, btInsert, btDelete);
hBox.setAlignment(Pos.CENTER);
pane.setBottom(hBox);
btInsert.setOnAction(e -> { int key = Integer.parseInt(tfKey.getText());
if (tree.search(key)) { // key is in the tree already
   view.displayTree();
view.setStatus(key + " is already in the tree"); } 
else {
tree.insert(key); // Insert a new key view.displayTree();
view.setStatus(key + " is inserted in the tree");
});
int key = Integer.parseInt(tfKey.getText());
if (!tree.search(key)) { // key is not in the tree
    view.displayTree();
view.setStatus(key + " is not in the tree"); } else {
tree.delete(key); // Delete a key view.displayTree();
view.setStatus(key + " is deleted from the tree");
 }